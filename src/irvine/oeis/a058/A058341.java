package irvine.oeis.a058;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058341 Primes p such that phi(x) = p - 1 has more than 2 solutions.
 * @author Sean A. Irvine
 */
public class A058341 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Euler.inversePhi(p.subtract(1)).size() > 2) {
        return p;
      }
    }
  }
}

