package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028942 Negative of numerator of y coordinate of n*P where P is generator for rational points on curve y^2+y = x^3-x.
 * @author Sean A. Irvine
 */
public class A028942 implements Sequence {

  private Q mX = null;
  private Q mY = Q.ZERO;

  protected Z select(final Q q) {
    return q.num().negate();
  }

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
    }
    return select(mY);
  }
}

