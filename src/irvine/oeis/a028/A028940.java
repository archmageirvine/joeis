package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028940 a(n) = numerator of the X-coordinate of n*P where P is the generator [0,0] for rational points on the curve y^2 + y = x^3 - x.
 * @author Sean A. Irvine
 */
public class A028940 extends Sequence1 {

  private Q mX = null;
  private Q mY = Q.ZERO;

  protected Z select(final Q q) {
    return q.num();
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
    return select(mX);
  }
}

