package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077344 Triangle in which n-th row contains n smallest primes beginning with n.
 * @author Sean A. Irvine
 */
public class A077344 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private String mS = null;
  private long mM = 0;
  private long mP = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mS = String.valueOf(++mN);
      mM = 0;
      mP = 1;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (String.valueOf(mP).startsWith(mS)) {
        return Z.valueOf(mP);
      }
    }
  }
}
