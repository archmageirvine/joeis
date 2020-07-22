package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A008460 Take sum of squares of digits of previous term; start with 6.
 * @author Sean A. Irvine
 */
public class A008460 implements Sequence {

  private Z mA = null;

  protected Z start() {
    return Z.SIX;
  }

  @Override
  public Z next() {
    mA = mA == null ? start() : Z.valueOf(ZUtils.digitSumSquares(mA));
    return mA;
  }
}
