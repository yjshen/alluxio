// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_master.proto

package alluxio.grpc;

public interface BlockMasterInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.block.BlockMasterInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 capacityBytes = 1;</code>
   * @return Whether the capacityBytes field is set.
   */
  boolean hasCapacityBytes();
  /**
   * <code>optional int64 capacityBytes = 1;</code>
   * @return The capacityBytes.
   */
  long getCapacityBytes();

  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 2;</code>
   */
  int getCapacityBytesOnTiersCount();
  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 2;</code>
   */
  boolean containsCapacityBytesOnTiers(
      java.lang.String key);
  /**
   * Use {@link #getCapacityBytesOnTiersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getCapacityBytesOnTiers();
  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getCapacityBytesOnTiersMap();
  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 2;</code>
   */

  long getCapacityBytesOnTiersOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 2;</code>
   */

  long getCapacityBytesOnTiersOrThrow(
      java.lang.String key);

  /**
   * <code>optional int64 freeBytes = 3;</code>
   * @return Whether the freeBytes field is set.
   */
  boolean hasFreeBytes();
  /**
   * <code>optional int64 freeBytes = 3;</code>
   * @return The freeBytes.
   */
  long getFreeBytes();

  /**
   * <code>optional int32 liveWorkerNum = 4;</code>
   * @return Whether the liveWorkerNum field is set.
   */
  boolean hasLiveWorkerNum();
  /**
   * <code>optional int32 liveWorkerNum = 4;</code>
   * @return The liveWorkerNum.
   */
  int getLiveWorkerNum();

  /**
   * <code>optional int32 lostWorkerNum = 5;</code>
   * @return Whether the lostWorkerNum field is set.
   */
  boolean hasLostWorkerNum();
  /**
   * <code>optional int32 lostWorkerNum = 5;</code>
   * @return The lostWorkerNum.
   */
  int getLostWorkerNum();

  /**
   * <code>optional int64 usedBytes = 6;</code>
   * @return Whether the usedBytes field is set.
   */
  boolean hasUsedBytes();
  /**
   * <code>optional int64 usedBytes = 6;</code>
   * @return The usedBytes.
   */
  long getUsedBytes();

  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 7;</code>
   */
  int getUsedBytesOnTiersCount();
  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 7;</code>
   */
  boolean containsUsedBytesOnTiers(
      java.lang.String key);
  /**
   * Use {@link #getUsedBytesOnTiersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getUsedBytesOnTiers();
  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getUsedBytesOnTiersMap();
  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 7;</code>
   */

  long getUsedBytesOnTiersOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 7;</code>
   */

  long getUsedBytesOnTiersOrThrow(
      java.lang.String key);
}
