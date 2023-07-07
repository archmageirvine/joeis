package irvine.oeis.a064;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001359;

/**
 * A064407 Even numbers not the sum of a pair of the lesser of the twin primes.
 * @author Sean A. Irvine
 */
public class A064407 extends A001359 {

  private long mN = 0;
  private long mP = super.next().longValueExact();
  private final HashSet<Long> mSeen = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mP < mN) {
        final Sequence s = new A001359();
        long t;
        do {
          t = s.next().longValueExact();
          mSeen.add(t + mP);
        } while (t != mP);
        mP = super.next().longValueExact();
      }
      if (!mSeen.remove(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

