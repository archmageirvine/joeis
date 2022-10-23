package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038093 Number of nodes in largest rooted identity tree of height n.
 * @author Sean A. Irvine
 */
public class A038093 extends Sequence0 {

  private Z mA = Z.ONE;
  private int mN = -1;

  private Z knuthArrow(final int n) {
    return n == 0 ? Z.ONE : Z.ONE.shiftLeft(knuthArrow(n - 1).intValueExact());
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(1).multiply(knuthArrow(mN - 1)).divide2().add(1);
    }
    return mA;
  }
}
