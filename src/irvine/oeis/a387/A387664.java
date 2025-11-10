package irvine.oeis.a387;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A387664 Smallest prime number with a constant convergence speed &gt;= n.
 * @author Sean A. Irvine
 */
public class A387664 extends Sequence1 {

  // After Marco Ripa, only good for a few terms

  private final DirectSequence mA = new A373387();
  private final Fast mPrime = new Fast();
  private final ArrayList<Z> mS = new ArrayList<>();
  private Z mK = Z.ONE;
  private int mN = 1;

  @Override
  public Z next() {
    while (mS.size() <= mN || mS.get(mN) == null) {
      mK = mPrime.nextPrime(mK);
      if (mK.isProbablePrime()) {
        final long t = mA.a(mK).longValueExact();
        while (mS.size() <= t) {
          mS.add(null);
        }
        for (int n = 0; n <= t; ++n) {
          if (mS.get(n) == null) {
            mS.set(n, mK);
          }
        }
      }
    }
    return mS.get(mN++);
  }
}

