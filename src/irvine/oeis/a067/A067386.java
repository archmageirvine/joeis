package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067386 Primes p such that p+1 and p-1 have the same number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A067386 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Jaguar.factor(p.subtract(1)).omega() == Jaguar.factor(p.add(1)).omega()) {
        return p;
      }
    }
  }
}

