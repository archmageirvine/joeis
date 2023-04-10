package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062827 Variation of Stechkin's function, A055004.
 * @author Sean A. Irvine
 */
public class A062827 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    Z sum = Z.ZERO;
    for (long k = 1, q = 2, p = 3; k < mN; ++k, q = p, p = mPrime.nextPrime(p)) {
      sum = sum.add((mP * q / p) * q);
    }
    return sum;
  }
}
