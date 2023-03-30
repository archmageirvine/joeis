package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062440 a(n) = Sum_{k=1..n} (prime(k) - 1)^n.
 * @author Sean A. Irvine
 */
public class A062440 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    long p = 1;
    for (int k = 1; k <= mN; ++k) {
      p = mPrime.nextPrime(p);
      sum = sum.add(Z.valueOf(p - 1).pow(mN));
    }
    return sum;
  }
}
