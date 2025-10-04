package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080898 a(1)=2; for n&gt;1, a(n+1) = least prime &gt; a(n) and congruent to a prime modulo prime successor of a(n).
 * @author Sean A. Irvine
 */
public class A080898 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = null;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.TWO;
    } else {
      final Z mod = mPrime.nextPrime(mP);
      do {
        mP = mPrime.nextPrime(mP);
      } while (!mPrime.isPrime(mP.mod(mod)));
    }
    return mP;
  }
}

