package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A065017 Primes of the form p*q + p + q, where (p, q=p+2) are twin primes.
 * @author Sean A. Irvine
 */
public class A065017 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.square().add(p.multiply(4)).add(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

