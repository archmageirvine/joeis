package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A057652 Numbers n such that n-2^k is a lucky number for all k such that 1 &lt; 2^k &lt; n.
 * @author Sean A. Irvine
 */
public class A057652 extends A000959 {

  private long mN = 0;
  {
    super.next();
  }

  private boolean is(final long n) {
    long t = 2;
    long k = mLucky.length() - 1;
    while (t < n) {
      final long a = n - t;
      while (mLucky.get(k) > a) {
        --k;
      }
      if (mLucky.get(k) < a) {
        return false;
      }
      t <<= 1;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mN > mLucky.get(mLucky.length() - 1)) {
        super.next();
      }
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
