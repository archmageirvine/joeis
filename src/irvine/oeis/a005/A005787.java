package irvine.oeis.a005;

import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005787 Reachable configurations on n circles.
 * @author Sean A. Irvine
 */
public class A005787 extends Sequence1 {

  private final HashSet<BitSet> mSeen = new HashSet<>();
  private final LinkedList<BitSet> mQ = new LinkedList<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 29) {
      throw new UnsupportedOperationException();
    }
    mSeen.clear();
    mQ.clear();
    final BitSet allWhite = new BitSet();
    mQ.add(allWhite);
    mSeen.add(allWhite);
    while (!mQ.isEmpty()) {
      final BitSet a = mQ.pollFirst();
      for (int circle = 0; circle < mN; ++circle) {
        final BitSet blackCopy = (BitSet) a.clone();
        final BitSet toggleCopy = (BitSet) a.clone();
        final int c = 1 << circle;
        for (int k = c; k < 1 << mN; ++k, k |= c) {
          blackCopy.set(k);
          toggleCopy.flip(k);
        }
        if (mSeen.add(blackCopy)) {
          mQ.add(blackCopy);
        }
        if (mSeen.add(toggleCopy)) {
          mQ.add(toggleCopy);
        }
      }
    }
    return Z.valueOf(mSeen.size());
  }
}
