package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393150 allocated for Leo Crabbe.
 * @author Sean A. Irvine
 */
public class A393150 extends Sequence1 {

  private Z mSumSquares = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = CR.valueOf(Z.valueOf(++mN).pow(3).subtract(mSumSquares)).sqrt().round();
    mSumSquares = mSumSquares.add(t.square());
    return t;
  }
}
