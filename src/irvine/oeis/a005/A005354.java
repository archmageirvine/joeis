package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a022.A022553;

/**
 * A005354 Number of asymmetric planar trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005354 extends A022553 {

  private long mN = -1;

  {
    super.next();
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Q a = new Q(super.next()).subtract(new Q(Functions.CATALAN.z(mN - 1), Z.TWO));
    if ((mN & 1) == 0) {
      a = a.subtract(new Q(Functions.CATALAN.z(mN / 2 - 1), Z.TWO));
    }
    return a.toZ();
  }
}
