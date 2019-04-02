package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008460 Take sum of squares of digits of previous term; start with 6.
 * @author Sean A. Irvine
 */
public class A008460 implements Sequence {

  private Z mA = null;

  private Z digitSumSquares(Z n) {
    Z sum = Z.ZERO;
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      sum = sum.add(qr[1].square());
      n = qr[0];
    }
    return sum;
  }

  protected Z start() {
    return Z.SIX;
  }

  @Override
  public Z next() {
    mA = mA == null ? start() : digitSumSquares(mA);
    return mA;
  }
}
