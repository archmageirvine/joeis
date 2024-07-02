package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071352 Numbers n such that the sum of two consecutive primes prime(n+1) + prime(n) is a prime power, say q^w. The w values are in A071087.
 * @author Sean A. Irvine
 */
public class A071352 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (Predicates.PRIME_POWER.is(p.add(mPrime.nextPrime(p)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

