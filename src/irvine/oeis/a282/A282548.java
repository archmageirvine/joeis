package irvine.oeis.a282;

import irvine.math.z.Z;
import irvine.oeis.a013.A013959;

/**
 * A282548 Expansion of phi_{12, 1}(x) where phi_{r, s}(x) = Sum_{n, m&gt;0} m^r * n^s * x^{m*n}.
 * @author Sean A. Irvine
 */
public class A282548 extends A013959 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().multiply(mN);
  }
}
