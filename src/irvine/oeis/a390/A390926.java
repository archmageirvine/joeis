package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A083468.
 * @author Sean A. Irvine
 */
public class A390926 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private final DynamicIntArray mPositions = new DynamicIntArray();
  private int mN = 0;
  private int mM = 0;
  private int mK = 0;

  // Return the next occurrence of n in mS continuing from previously reported position
  private int t(final int n) {
    final String s = String.valueOf(n);
    int k;
    while ((k = mS.indexOf(s, mPositions.get(n))) < 0) {
      for (int j = 0; j < 100; ++j) { // Add 100 new numbers (simply to avoid doing this too often)
        mS.append(++mK);
      }
    }
    mPositions.set(n, k + 1); // Where to start the next search for n
    return k;
  }


  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN - mM) + 1); // +1 changes 0-indexing to 1-indexing
  }
}
