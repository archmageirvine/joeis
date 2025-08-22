package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079595 Primes of the form floor(x^Pi) where x is prime.
 * @author Sean A. Irvine
 */
public class A079595 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = CR.valueOf(super.next()).pow(CR.PI).floor();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
