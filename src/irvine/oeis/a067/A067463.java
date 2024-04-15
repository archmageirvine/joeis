package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067463 Primes p such that p+sigma(p+1) is prime.
 * @author Sean A. Irvine
 */
public class A067463 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(Functions.SIGMA.z(p.add(1))).isProbablePrime()) {
        return p;
      }
    }
  }
}

