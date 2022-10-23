package irvine.oeis.a105;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A105605 An Aitken-like array: see Comments for definition.
 * @author Sean A. Irvine
 */
public class A105605 extends Sequence1 {

  private ArrayList<Integer> mCurrent = new ArrayList<>();
  private int mPositionInRow = 0;

  @Override
  public Z next() {
    if (mPositionInRow >= mCurrent.size()) {
      if (mCurrent.isEmpty()) {
        mCurrent.add(1);
      } else {
        final ArrayList<Integer> nextRow = new ArrayList<>();
        nextRow.add(mCurrent.get(mCurrent.size() - 1));
        for (int k = 0; k < mCurrent.size(); ++k) {
          final int sum = mCurrent.get(k) + nextRow.get(k);
          if (sum < 10) {
            nextRow.add(sum);
          } else {
            nextRow.add(sum / 10);
            nextRow.add(sum % 10);
          }
        }
        mCurrent = nextRow;
        mPositionInRow = 0;
      }
    }
    return Z.valueOf(mCurrent.get(mPositionInRow++));
  }
}

