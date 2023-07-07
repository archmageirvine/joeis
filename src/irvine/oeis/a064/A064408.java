package irvine.oeis.a064;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006512;

/**
 * A064408 Even numbers not the sum of a pair of the greater of the twin primes.
 * @author Sean A. Irvine
 */
public class A064408 extends A006512 {

  private long mN = 0;
  private long mP = super.next().longValueExact();
  private final HashSet<Long> mSeen = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mP < mN) {
        final Sequence s = new A006512();
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

