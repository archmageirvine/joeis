package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075902 Primes p = prime(k) such that the decimal representation of p contains k as a substring.
 * @author Sean A. Irvine
 */
public class A075902 extends A000040 {

  private long mN = 0;
  private long mM = 10;

  private boolean is(Z p) {
    while (p.compareTo(mN) >= 0) {
      if (p.mod(mM) == mN) {
        return true;
      }
      p = p.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mM) {
        mM *= 10;
      }
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
