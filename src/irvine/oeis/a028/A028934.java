package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028934 Negative of numerator of y-coordinate of <code>(2n+1)*P</code> where P is the generator for rational points on the curve <code>y^2 + y = x^3 - x</code>.
 * @author Sean A. Irvine
 */
public class A028934 implements Sequence {

  private Q mX = null;
  private Q mY = Q.ZERO;

  @Override
  public Z next() {
    if (mX == null) {
      mX = Q.ZERO;
    } else {
      if (Q.ZERO.equals(mX)) {
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
    return mY.num().negate();
  }
}

