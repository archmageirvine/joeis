package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a003.A003592;

/**
 * A077497 Primes of the form 2^r*5^s + 1.
 * @author Sean A. Irvine
 */
public class A077497 extends A003592 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
