package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084766 Sum of numbers of prime-factors {2*n-p: 2&lt;p&lt;2*n, p prime}, with repetitions.
 * @author Sean A. Irvine
 */
public class A084766 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (long p = 3; p < mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(Functions.BIG_OMEGA.l(mN - p));
    }
    return sum;
  }
}
