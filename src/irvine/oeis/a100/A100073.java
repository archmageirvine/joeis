package irvine.oeis.a100;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A100073 Number of representations of n as the difference of two positive squares.
 * @author Sean A. Irvine
 */
public class A100073 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      return Functions.SIGMA0.z(mN).divide2();
    }
    if (((mN / 2) & 1) == 1) {
      return Z.ZERO;
    }
    return Functions.SIGMA0.z(mN / 4).divide2();
  }
}
