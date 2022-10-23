package irvine.oeis.a032;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032448 Smallest prime == -1 modulo prime(n).
 * @author Sean A. Irvine
 */
public class A032448 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long q = 2;
    while (q % mP != mP - 1) {
      q = mPrime.nextPrime(q);
    }
    return Z.valueOf(q);
  }
}
