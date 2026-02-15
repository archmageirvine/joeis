package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393150 a(n) is chosen such that the root mean square of all terms so far is closest to n by absolute difference.
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
