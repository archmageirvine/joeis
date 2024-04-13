package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061783 Luhn primes: primes p such that p + (p reversed) is also a prime.
 * @author Sean A. Irvine
 */
public class A061783 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(Functions.REVERSE.z(p)).isProbablePrime()) {
        return p;
      }
    }
  }
}

