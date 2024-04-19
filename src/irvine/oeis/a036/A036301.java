package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A036301 Numbers whose sum of even digits and sum of odd digits are equal.
 * @author Sean A. Irvine
 */
public class A036301 extends AbstractSequence {

  private long mN = 0;
  private final int mDiff;

  /** Construct the sequence. */
  public A036301() {
    this(1, 0);
  }

  /**
   * Generic constructor with parameter.
   * @param offset first index
   * @param diff difference of sums of even/odd digits
   */
  public A036301(final int offset, final int diff) {
    super(offset);
    mN = -1;
    mDiff = diff;
  }

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      long e = 0;
      long o = 0;
      while (m != 0) {
        if ((m & 1) == 0) {
          e += m % 10;
        } else {
          o += m % 10;
        }
        m /= 10;
      }
      if (Math.abs(e - o) == mDiff) {
        return Z.valueOf(mN);
      }
    }
  }
}

