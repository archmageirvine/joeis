package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a068.A068466;

/**
 * A014513 <code>[ GAMMA(n+1/4) ]</code>.
 * @author Sean A. Irvine
 */
public class A014513 implements Sequence {

  private Z mF = Z.ONE;
  private Z mT = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(4L * mN - 3);
      mT = mT.shiftLeft(2);
    }
    return CR.valueOf(new Q(mF, mT)).multiply(A068466.GAMMA_QUARTER).floor();
  }
}
