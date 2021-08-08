package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A049984 Primes of the form n! - (n-1)! + 1.
 * @author Sean A. Irvine
 */
public class A049984 extends A000142 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Z u = mA.subtract(t).add(1);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
