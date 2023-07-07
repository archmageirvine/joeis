package irvine.oeis.a064;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006512;

/**
 * A064409 Even numbers not the sum of a pair of twin primes, one the lesser and the other the greater.
 * @author Sean A. Irvine
 */
public class A064409 extends Sequence1 {

  private final Sequence mLowerSeq = new A001359();
  private final Sequence mUpperSeq = new A006512();
  private long mN = 0;
  private long mP = mLowerSeq.next().longValueExact();
  private long mQ = mUpperSeq.next().longValueExact();
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
        } while (t <= mP);
        mP = mLowerSeq.next().longValueExact();
      }
      if (mQ < mN) {
        final Sequence s = new A001359();
        long t;
        do {
          t = s.next().longValueExact();
          mSeen.add(t + mQ);
        } while (t <= mQ);
        mQ = mUpperSeq.next().longValueExact();
      }
      if (!mSeen.remove(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

