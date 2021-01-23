package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038531 Primes that are concatenations of k-th prime and k-th composite.
 * @author Sean A. Irvine
 */
public class A038531 extends A038530 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
