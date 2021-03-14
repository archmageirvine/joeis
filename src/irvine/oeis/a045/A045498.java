package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A045498 Primes formed from concatenation of two consecutive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A045498 extends A000045 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z u = new Z(t.toString() + mA);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
