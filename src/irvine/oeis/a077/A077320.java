package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077320 Triangle in which n-th row contains n smallest multiples of the n-th prime.
 * @author Sean A. Irvine
 */
public class A077320 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP * mM);
  }
}
