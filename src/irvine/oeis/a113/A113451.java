package irvine.oeis.a113;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A113451 Integers n such that prime(n+1) - prime(n) is a power.
 * @author Sean A. Irvine
 */
public class A113451 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (Z.TWO.equals(p) || Predicates.POWER.is(mPrime.nextPrime(p).subtract(p))) {
        return Z.valueOf(mN);
      }
    }
  }
}

