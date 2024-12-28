package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073914 Triangle read by rows in which row n gives n smallest n-digit primes.
 * @author Sean A. Irvine
 */
public class A073914 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mM = 0;
  private Z mP = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      mP = Z.TEN.pow(++mN);
    }
    mP = mPrime.nextPrime(mP);
    return mP;
  }
}

