package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A001756 a(n) = A059366(n,n-3) = A059366(n,3) for n &gt;= 3, where the triangle A059366 arises from the expansion of a trigonometric integral.
 * @author Sean A. Irvine
 */
public class A001756 extends Sequence3 {

  private long mN = 2;
  private Z mA = Z.valueOf(15);

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(mN).multiply(2 * mN - 7).divide(mN - 3);
    }
    return mA;
  }
}
