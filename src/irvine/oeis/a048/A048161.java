package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048161 Primes p such that q = (p^2 + 1)/2 is also a prime.
 * @author Sean A. Irvine
 */
public class A048161 extends A000040 {

  {
    super.next(); // skip p=2
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.square().add(1).divide2().isProbablePrime()) {
        return p;
      }
    }
  }
}

