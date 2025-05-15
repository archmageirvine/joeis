package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a003.A003596;

/**
 * A077315 Primes of the form 2^r * 11^s - 1.
 * @author Sean A. Irvine
 */
public class A077315 extends A003596 {

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
