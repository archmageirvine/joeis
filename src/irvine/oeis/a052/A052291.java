package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052291 Primes p such that 4p^2 + 1 is also prime.
 * @author Sean A. Irvine
 */
public class A052291 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.square().multiply(4).add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
