package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a073.A073006;

/**
 * A014517 Nearest integer to Gamma(n+2/3).
 * @author Sean A. Irvine
 */
public class A014517 implements Sequence {

  private Z mF = Z.ONE;
  private Z mT = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(3L * mN - 1);
      mT = mT.multiply(3);
    }
    return CR.valueOf(new Q(mF, mT)).multiply(A073006.GAMMA_TWO_THIRDS).round();
  }
}
