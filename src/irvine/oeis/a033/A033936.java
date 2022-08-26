package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033936 a(n+1) = a(n) + sum of squares of digits of a(n).
 * @author Sean A. Irvine
 */
public class A033936 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSumSquares(mA));
    return mA;
  }
}
