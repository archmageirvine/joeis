package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070740 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return Functions.FACTORIAL.z(2 * mN);
    } else if ((mN & 3) == 1) {
      return Functions.FACTORIAL.z(mN).square().divide2();
    } else {
      return Functions.FACTORIAL.z(mN).square();
    }
  }
}
