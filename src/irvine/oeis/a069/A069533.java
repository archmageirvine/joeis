package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069533 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(mN * mN / p / p);
    }
    return sum;
  }
}
