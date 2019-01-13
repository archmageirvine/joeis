package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002082.
 * @author Sean A. Irvine
 */
public class A002082 implements Sequence {

  private static final long[] SECOND_DIFFS = {4, 2, 2, 4, 0, 6, 8, 8, 6, 0};

  private int mSecondDiffPos = -1;
  private Z mFirstDiff = Z.valueOf(-6);
  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    ++mSecondDiffPos;
    mSecondDiffPos %= SECOND_DIFFS.length;
    mFirstDiff = mFirstDiff.add(SECOND_DIFFS[mSecondDiffPos]);
    mA = mA.add(mFirstDiff);
    return mA;
  }
}
