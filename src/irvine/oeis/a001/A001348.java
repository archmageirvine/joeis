package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001348 Mersenne numbers: 2^p - 1, where p is prime.
 * @author Sean A. Irvine
 */
public class A001348 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.ONE.shiftLeft(mP).subtract(1);
  }
}
