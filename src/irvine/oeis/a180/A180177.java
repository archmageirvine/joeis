package irvine.oeis.a180;

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A180177 Triangle read by rows: T(n,k) is the number of compositions of n without 2&apos;s and having k parts; 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A180177 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A180177() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param omit number to be omitted from the composition
   */
  public A180177(final int offset, final int omit) {
    super(offset, new PaddingSequence(onesZero(omit - 1), new long[] {1}));
  }

  /**
   * Generate an array of ones followed by a single zero.
   * @param ones number of ones
   * @return long[] array
   */
  private static long[] onesZero(final int ones) {
    final long[] result = new long[ones + 1];
    int i = 0;
    while (i < ones) {
      result[i++] = 1;
    }
    result[i] = 0;
    return result;
  }
}
