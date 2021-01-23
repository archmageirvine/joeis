package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a005.A005512;

/**
 * A007831 Number of edge-labeled series-reduced trees with n nodes.
 * @author Sean A. Irvine
 */
public class A007831 extends A005512 {

  private long mN = 1;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    return super.next().divide(mN);
  }
}
