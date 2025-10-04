package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a058.A058335;

/**
 * A080932 Non-occurring pairwise differences between the elements of the Mian-Chowla sequence variant A058335.
 * @author Sean A. Irvine
 */
public class A080932 extends Sequence1 {

  private static final long HEURISTIC = 100;
  private final A058335 mMianChowla = new A058335();
  private final HashSet<Z> mDifferences = new HashSet<>();
  private final HashSet<Z> mReported = new HashSet<>();
  private Z mA = Z.valueOf(25);

  @Override
  public Z next() {
    for (long k = 0; k < HEURISTIC; ++k) {
      final Z t = mMianChowla.next();
      for (final Z u : mMianChowla) {
        final Z diff = t.subtract(u);
        if (mDifferences.add(diff) && mReported.contains(diff)) {
          throw new RuntimeException("Previously reported " + diff + " was incorrect");
        }
      }
    }
    do {
      mA = mA.add(1);
    } while (mDifferences.contains(mA));
    mReported.add(mA);
    return mA;
  }
}

