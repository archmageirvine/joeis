package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a003.A003592;

/**
 * A077313 Primes of the form 2^r*5^s - 1.
 * @author Sean A. Irvine
 */
public class A077313 extends A003592 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
