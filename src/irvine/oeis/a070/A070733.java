package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070733 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    } else if (mN == 4) {
      return Z.FOUR;
    } else if (mN == 5) {
      return Z.valueOf(20);
    } else if ((mN & 1) == 0) {
      return Functions.FACTORIAL.z(mN).divide(mN - 2).divide2();
    } else {
      return Functions.FACTORIAL.z(mN).divide(mN - 3).divide2();
    }
  }
}

