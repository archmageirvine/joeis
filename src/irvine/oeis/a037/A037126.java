package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037126 Triangle T(n,k) = prime(k) for k = 1..n.
 * @author Sean A. Irvine
 */
public class A037126 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mQ = 2;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (mP == mQ) {
      mQ = mPrime.nextPrime(mQ);
      mP = 2;
    }
    return Z.valueOf(mP);
  }
}
