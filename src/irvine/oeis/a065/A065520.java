package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065520 Numbers n with the property that if m is formed from n by dropping any number (possibly zero) of initial or final digits then there is a prime ending with m.
 * @author Sean A. Irvine
 */
public class A065520 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    while (n != 0) {
      if (n == 2 || n == 5) {
        return true;
      }
      final long m = n % 10;
      if (m != 1 && m != 3 && m != 7 && m != 9) {
        return false;
      }
      n /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
