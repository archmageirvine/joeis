package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079593 Primes equal to floor(Pi*x) where x is prime.
 * @author Sean A. Irvine
 */
public class A079593 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = CR.PI.multiply(super.next()).floor();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
