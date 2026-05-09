package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084754 Triangle read by rows: row n lists the first n primes greater than n.
 * @author Sean A. Irvine
 */
public class A084754 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mP = ++mN;
      mM = 0;
    }
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mP);
  }
}
