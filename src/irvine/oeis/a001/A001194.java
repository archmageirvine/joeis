package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001194 <code>a(n) = A059366(n,n-2) = A059366(n,2)</code> for <code>n &gt;= 2</code>, where the triangle <code>A059366</code> arises in the expansion of a trigonometric integral.
 * @author Sean A. Irvine
 */
public class A001194 implements Sequence {

  private Z mPrev = Z.THREE;
  private long mN = 1;
  private Z mDF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 2) {
      if (mN > 3) {
        mDF = mDF.multiply(2 * mN - 7);
      }
      mPrev = mPrev.multiply(2 * mN - 1).subtract(mDF.multiply(mN - 1).multiply(3));
    }
    return mPrev;
  }
}
