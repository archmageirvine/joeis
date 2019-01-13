package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000879.
 * @author Sean A. Irvine
 */
public class A000879 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 2;
  private long mC = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long lim = mP * mP;
    while (mN < lim) {
      ++mC;
      mN = mPrime.nextPrime(mN);
    }
    return Z.valueOf(mC);
  }
}

