package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033561 Primes p such that 6!+p is also prime.
 * @author Sean A. Irvine
 */
public class A033561 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(720).isProbablePrime()) {
        return p;
      }
    }
  }
}
