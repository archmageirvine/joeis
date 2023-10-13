package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028934 Negative of numerator of y-coordinate of (2n+1)*P where P is the generator for rational points on the curve y^2 + y = x^3 - x.
 * @author Sean A. Irvine
 */
public class A028934 extends Sequence0 {

  private Q mX = null;
  private Q mY = Q.ZERO;

  protected Z select(final Q y) {
    return y.num().negate();
  }

  @Override
  public Z next() {
    if (mX == null) {
      mX = Q.ZERO;
    } else {
      if (mX.isZero()) {
        mX = Q.ONE;
      } else {
        final Q x = mY.square().subtract(mX.pow(3)).divide(mX.square());
        mY = mY.multiply(x).divide(mX).negate().subtract(1);
        mX = x;
      }
      final Q x1 = mY.square().subtract(mX.pow(3)).divide(mX.square());
      mY = mY.multiply(x1).divide(mX).negate().subtract(1);
      mX = x1;
    }
    return select(mY);
  }
}

