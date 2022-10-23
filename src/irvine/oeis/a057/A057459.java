package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057459 a(n+1) = smallest prime p in the range a(n) &lt; p &lt; a(1)*a(2)*...*a(n) such that p-1 divides a(1)*a(2)*...*a(n); or if no such prime p exists, then a(n+1) = smallest prime &gt; a(n).
 * @author Sean A. Irvine
 */
public class A057459 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z def = mP;
    while (true) {
      mP = mPrime.nextPrime(mP);
      final boolean none = mP.compareTo(mA) > 0;
      if (none || mA.mod(mP.subtract(1)).isZero()) {
        if (none) {
          mP = mPrime.nextPrime(def);
        }
        mA = mA.multiply(mP);
        return mP;
      }
    }
  }
}
