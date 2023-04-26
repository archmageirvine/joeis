package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063442 Primes of the form p*q+4 where p and q are consecutive primes.
 * @author Sean A. Irvine
 */
public class A063442 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      final Z t = mP.multiply(q).add(4);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
