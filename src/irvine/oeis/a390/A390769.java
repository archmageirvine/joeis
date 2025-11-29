package irvine.oeis.a390;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001223;

/**
 * A390769 Least even positive integer k that does not appear in the first n prime gaps.
 * @author Sean A. Irvine
 */
public class A390769 extends Sequence1 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final Sequence mGaps = new A001223();
  private Z mLeast = Z.TWO;

  @Override
  public Z next() {
    final Z gap = mGaps.next();
    if (gap.compareTo(mLeast) >= 0) {
      mSeen.add(gap);
    }
    while (mSeen.remove(mLeast)) {
      mLeast = mLeast.add(2);
    }
    return mLeast;
  }
}
