package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067467 Primes p such that p-1 has 3 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A067467 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.OMEGA.i(p.subtract(1)) == 3) {
        return p;
      }
    }
  }
}

