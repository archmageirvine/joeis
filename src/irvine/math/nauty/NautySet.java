package irvine.math.nauty;

import java.util.Arrays;

/**
 * Bit set using nauty conventions for ordering.
 * @author Sean A. Irvine
 */
public class NautySet {

  // Nauty uses a different bit ordering to Java BitSet

  final long[] mSet;

  /**
   * Construct a new bit set of specified size.
   * @param size size of set
   */
  public NautySet(final int size) {
    mSet = new long[size];
  }

  void set(final int k) {
    mSet[k >>> 6] |= GenerateGraphs.BIT[k & 0x3F];
  }

  void clear(final int k) {
    mSet[k >>> 6] &= ~GenerateGraphs.BIT[k & 0x3F];
  }

  boolean isSet(final int k) {
    //return k >= 0 && (mSet[k >>> 6] & ~GenerateGraphs.BIT[k & 0x3F]) != 0;
    return (mSet[k >>> 6] & GenerateGraphs.BIT[k & 0x3F]) != 0;
  }

  long getBlock(final int k) {
    return mSet[k];
  }

  void setBlock(final int k, final long v) {
    mSet[k] = v;
  }

  int next(final int i) {
    int k = i + 1;
    int j = k >>> 6;
    k &= 0x3F;
    while (true) {
      if (j >= mSet.length) {
        return -1;
      }
      final int t = NautyUtil.nextElement(mSet, j, k - 1);
      if (t != -1) {
        return t + (j << 6);
      }
      ++j;
      k = 0;
    }
  }

  void clear() {
    Arrays.fill(mSet, 0);
  }

}
