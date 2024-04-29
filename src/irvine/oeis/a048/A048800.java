package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048800 E.g.f. satisfies A(x) = 1 + x * A(x / (1 - x)).
 * @author Sean A. Irvine
 */
public class A048800 extends Sequence0 {

  private Z mF = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ONE;
    }
    if (mN > 0) {
      mF = mF.multiply(mN + 1);
    }
    return Functions.BELL.z(mN).multiply(mF);
  }
}
