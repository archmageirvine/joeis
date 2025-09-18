package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079101 A repetition-resistant sequence.
 * @author Sean A. Irvine
 */
public class A079101 extends Sequence1 {

  protected final StringBuilder mS = new StringBuilder();
  private int mLongestRepeat = 0;

  @Override
  public Z next() {
    if (mS.length() == 0) {
      mS.append('0');
      return Z.ZERO;
    }
    // Try 0
    mS.append('0');
    final int start = mS.length() - 1 - mLongestRepeat;
    final int idx0 = mS.indexOf(mS.substring(start));
    final int max0 = idx0 >= 0 && idx0 < start ? mLongestRepeat + 1 : mLongestRepeat;
    // Try 1
    mS.setCharAt(mS.length() - 1, '1');
    final int idx1 = mS.indexOf(mS.substring(start));
    final int max1 = idx1 >= 0 && idx1 < start ? mLongestRepeat + 1 : mLongestRepeat;
    if (max0 > max1) {
      mLongestRepeat = max1;
      return Z.ONE;
    } else {
      mS.setCharAt(mS.length() - 1, '0');
      mLongestRepeat = max0;
      return Z.ZERO;
    }
  }
}

