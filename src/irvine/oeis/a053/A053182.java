package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053182 Primes p such that p^2 + p + 1 is prime.
 * @author Sean A. Irvine
 */
public class A053182 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.square().add(p).add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}

