package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030816 a(n) = floor(exp(13/23)*n!).
 * @author Sean A. Irvine
 */
public class A030816 extends Sequence1 {

  private static final CR EXP13_23 = CR.valueOf(new Q(13, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP13_23.multiply(mF).floor();
  }
}
