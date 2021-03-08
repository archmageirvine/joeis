package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A043297 Primes p such that B(4*p) has denominator 30 where B(2n) are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A043297 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TWO.equals(p) || (!p.multiply2().add(1).isProbablePrime() && !p.multiply(4).add(1).isProbablePrime())) {
        return p;
      }
    }
  }
}

