package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a068.A068465;

/**
 * A014514 a(n) = floor( Gamma(n+3/4) ).
 * @author Sean A. Irvine
 */
public class A014514 extends Sequence0 {

  private Z mF = Z.ONE;
  private Z mT = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(4L * mN - 1);
      mT = mT.shiftLeft(2);
    }
    return CR.valueOf(new Q(mF, mT)).multiply(A068465.GAMMA_THREE_QUARTERS).floor();
  }
}
