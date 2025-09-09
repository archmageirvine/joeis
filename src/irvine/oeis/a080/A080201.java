package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051788;

/**
 * A080201 Numbers that do not occur as differences between terms of the Mian-Chowla variant A051788.
 * @author Sean A. Irvine
 */
public class A080201 extends Sequence1 {

  private static final long HEURISTIC = 100;
  private final A051788 mMianChowla = new A051788();
  private final HashSet<Z> mDifferences = new HashSet<>();
  private final HashSet<Z> mReported = new HashSet<>();
  private Z mA = Z.valueOf(48);

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

