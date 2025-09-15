package irvine.oeis.a387;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387354 a(n) = least prime m such that m/prime(n) &gt; a(n-1)/prime(n-1), where a(1) = 3.
 * @author Sean A. Irvine
 */
public class A387354 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private long mP = 2;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      mA = mPrime.nextPrime(mA.multiply(mP).divide(q));
    }
    return mA;
  }
}

