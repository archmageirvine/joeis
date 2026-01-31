package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A387487 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A387487 extends Sequence2 {

  private final StringBuilder mS = new StringBuilder();
  private int mN = 0;
  private int mK = 0;

  @Override
  public Z next() {
    ++mN;
    if (mS.length() < mN + 100) { // 100 digits way more than we will match
      for (int j = 0; j < 100; ++j) { // Add 100 new numbers (simply to avoid doing this too often)
        mS.append(++mK);
      }
    }
    long matches = 0;
    int k = -1; // position in mS
    while (mS.charAt(++k) == mS.charAt(mN + k)) {
      ++matches;
    }
    return Z.valueOf(matches);
  }
}
