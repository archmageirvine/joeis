package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033623 Grundy function for turn-at-most-4-coins game.
 * @author Sean A. Irvine
 */
public class A033623 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.contains(mN));
    for (int k = 0; k < size(); ++k) {
      final Z a = get(k).xor(mN);
      mForbidden.add(a);
      for (int j = k + 1; j < size(); ++j) {
        mForbidden.add(a.xor(get(j)));
      }
    }
    mForbidden.add(mN);
    return mN;
  }
}
