package irvine.oeis.a062;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A062295 A B_2 sequence: a(n) is the smallest square such that pairwise sums of not necessarily distinct elements are all distinct.
 * @author Sean A. Irvine
 */
public class A062295 extends MemorySequence {

  private long mN = 0;
  private final HashSet<Z> mSums = new HashSet<>();

  private boolean isOk(final Z square) {
    for (final Z v : this) {
      if (mSums.contains(v.add(square))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    while (true) {
      final Z square = Z.valueOf(++mN).square();
      if (isOk(square)) {
        for (final Z v : this) {
          mSums.add(square.add(v));
        }
        mSums.add(square.multiply2());
        return square;
      }
    }
  }
}

