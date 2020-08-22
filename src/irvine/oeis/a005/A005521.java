package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005521 1 + (sum of first n odd primes - n)/2.
 * @author Sean A. Irvine
 */
public class A005521 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mP = 2;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mP = mPrime.nextPrime(mP);
    mSum = mSum.add(mP);
    return mSum.subtract(mN).divide2().add(Z.ONE);
  }
}
