package irvine.oeis.a136;
// manually 2025-09-12

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A136706 At step n the sequence lists the number of occurrences of digit (n mod k), with k&gt;0, in all the numbers from 1 to n. Case k=2.
 * @author Georg Fischer
 */
public class A136706 extends AbstractSequence {

  private int mN;
  private int mK;
  private int[] mDc; // total occurrences of digits so far

  /** Construct the sequence. */
  public A136706() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param k modulus
   */
  public A136706(final int offset, final int k) {
    super(offset);
    mN = 0;
    mK = k;
    mDc = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    final int[] dc = ZUtils.digitCounts(mN);
    for (int i = 0; i < 10; ++i) {
      mDc[i] += dc[i];
    }
    return Z.valueOf(mDc[mN % mK]);
  }
}
