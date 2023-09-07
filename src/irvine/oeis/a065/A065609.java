package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065609 Positive m such that when written in binary, no rotated value of m is greater than m.
 * @author Sean A. Irvine
 */
public class A065609 extends Sequence1 {

  private long mN = 0;
  private long mBit = 1;
  private long mBit1 = 2;

  private boolean is(final long n) {
    long m = n;
    do {
      m = (m & 1) * mBit + (m >>> 1);
      if (m > n) {
        return false;
      }
    } while (m != n);
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mBit1) {
        mBit = mBit1;
        mBit1 <<= 1;
      }
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
