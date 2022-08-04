package irvine.oeis.a058;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058340 Primes p such that phi(x) = p-1 has only 2 solutions, namely x = p and x = 2p.
 * @author Sean A. Irvine
 */
public class A058340 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Euler.inversePhi(p.subtract(1)).size() == 2) {
        return p;
      }
    }
  }
}

