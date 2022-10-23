package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001002 Number of dissections of a convex (n+2)-gon into triangles and quadrilaterals by nonintersecting diagonals.
 * @author Sean A. Irvine
 */
public class A001002 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final Z t = mB.multiply(2 * mN - 1).multiply(mN).multiply(11)
      .add(mA.multiply(3 * mN - 4).multiply(3 * mN - 2).multiply(3))
      .divide(mN).divide(mN + 1).divide(5);
    mA = mB;
    mB = t;
    return t;
  }
}
