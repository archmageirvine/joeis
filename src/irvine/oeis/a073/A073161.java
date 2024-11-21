package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073161 Nested floor product of n and fractions (p_k + 1)/p_k where p_k is k-th prime.
 * @author Sean A. Irvine
 */
public class A073161 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z t = m;
      m = m.multiply(p + 1).divide(p);
      if (m.equals(t)) {
        return m;
      }
    }
  }
}
