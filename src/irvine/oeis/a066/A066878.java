package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066878 Primes of the form p^3 - 2 where p is prime.
 * @author Sean A. Irvine
 */
public class A066878 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().pow(3).subtract(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
