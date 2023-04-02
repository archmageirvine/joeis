package irvine.oeis.a361;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A361136 extends Sequence1 {

  // Where the faces go on a given direction of rotation
  private static final int[][] ROTATIONS = {
    {1, 2, 3, 0, 4, 5}, // right
    {4, 1, 5, 3, 2, 0}, // down
    {3, 0, 1, 2, 4, 5}, // left
    {5, 1, 4, 3, 0, 2}, // up
  };

  //                          0       1       2     3       4      5
  //                         top    right   bottom left   front   back
  private Z[] mDice0 = {null, Z.FIVE, Z.SIX, Z.TWO, Z.FOUR, Z.THREE};
  private Z[] mDice1 = new Z[6];
  private int mDir = -1; // 0 = right, 1 = down, 2 = left, 3 = up
  private long mN = 0;
  private long mM = 0;
  private boolean mSecondStep = true;


  @Override
  public Z next() {
    if (mDice0[0] == null) {
      mDice0[0] = Z.ONE;
    } else {
      if (--mM <= 0) {
        ++mDir;
        mDir &= 3;
        if (!mSecondStep) {
          mSecondStep = true;
          mM = mN;
        } else {
          mSecondStep = false;
          mM = ++mN;
        }
      }
      for (int k = 0; k < mDice0.length; ++k) {
        mDice1[ROTATIONS[mDir][k]] = mDice0[k];
      }
      final Z[] t = mDice0;
      mDice0 = mDice1;
      mDice1 = t;
    }
    return mDice0[0];
  }
}
