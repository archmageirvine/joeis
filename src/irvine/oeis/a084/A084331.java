package irvine.oeis.a084;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084331 a(1) = 2; a(n+1) is the least prime p not already used such that |p-a(n)| is not equal to |a(k+1)-a(k)| for any k &lt; n.
 * @author Sean A. Irvine
 */
public class A084331 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private final HashSet<Z> mUsedPrimes = new HashSet<>();
  private final HashSet<Z> mForbiddenDiffs = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      Z p = Z.TWO;
      while (true) {
        p = mPrime.nextPrime(p);
        if (!mUsedPrimes.contains(p)) {
          final Z f = mA.subtract(p).abs();
          if (mForbiddenDiffs.add(f)) {
            mA = p;
            break;
          }
        }
      }
    }
    mUsedPrimes.add(mA);
    return mA;
  }
}
