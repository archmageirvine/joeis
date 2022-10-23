package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030641 a(1) = 6; for n &gt; 1, a(n) = product of next 2 primes after a(n-1).
 * @author Sean A. Irvine
 */
public class A030641 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SIX;
    } else {
      final Z t = mPrime.nextPrime(mA);
      mA = t.multiply(mPrime.nextPrime(t));
    }
    return mA;
  }
}
