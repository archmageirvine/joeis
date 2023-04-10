package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062788 Squares of the form 5n*(n-1)+1.
 * @author Sean A. Irvine
 */
public class A062788 extends Sequence1 {

  private Z mX = Z.ONE;
  private Z mY = Z.ZERO;

  @Override
  public Z next() {
    final Z x = mX.multiply(9).add(mY.multiply(20)).subtract(10);
    final Z y = mX.multiply(4).add(mY.multiply(9)).subtract(4);
    mX = x;
    mY = y;
    return mX.square();
  }
}
