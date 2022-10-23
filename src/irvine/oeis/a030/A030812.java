package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030812 a(n) = floor(exp(17/23) * n!).
 * @author Sean A. Irvine
 */
public class A030812 extends Sequence1 {

  private static final CR EXP17_23 = CR.valueOf(new Q(17, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP17_23.multiply(mF).floor();
  }
}
