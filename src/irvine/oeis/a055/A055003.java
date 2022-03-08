package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055003 a(n) = prime(prime(n)-1).
 * @author Sean A. Irvine
 */
public class A055003 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 1;
  private long mM = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mM < mP - 1) {
      mQ = mPrime.nextPrime(mQ);
      ++mM;
    }
    return Z.valueOf(mQ);
  }
}
