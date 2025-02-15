package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075322 extends Sequence1 {

  private final Fast mPrimes = new Fast();
  private final Set<Z> mSeen = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    Z p = Z.TWO;
    while (true) {
      p = mPrimes.nextPrime(p);
      if (!mSeen.contains(p)) {
        final Z q = p.add(mN);
        if (q.isProbablePrime() && mSeen.add(q)) {
          mSeen.add(p);
          return q;
        }
      }
    }
  }
}
