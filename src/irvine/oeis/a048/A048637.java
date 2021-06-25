package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048637 Primes p such that p^3 + 2 is also prime.
 * @author Sean A. Irvine
 */
public class A048637 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(3).add(2).isProbablePrime()) {
        return p;
      }
    }
  }
}
