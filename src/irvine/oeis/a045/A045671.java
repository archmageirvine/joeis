package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045671 Extension of Beatty sequence; complement of A045672.
 * @author Sean A. Irvine
 */
public class A045671 extends MemorySequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mLeast = Z.ZERO;

  private Z mex() {
    while (mSeen.contains(mLeast)) {
      mLeast = mLeast.add(1);
    }
    return mLeast;
  }

  protected Z select(final Z a, final Z b) {
    return a;
  }

  protected long multiplier() {
    return 2;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      mSeen.add(Z.ZERO);
      return Z.ZERO;
    }
    final Z a = mex();
    mSeen.add(a);
    final Z b = a.multiply2().add(n * multiplier());
    mSeen.add(b);
    return select(a, b);
  }
}
