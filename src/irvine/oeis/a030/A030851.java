package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030851 a(n) = floor(exp(1/21) * n!).
 * @author Sean A. Irvine
 */
public class A030851 extends Sequence1 {

  private static final CR EXP1_21 = CR.valueOf(new Q(1, 21)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_21.multiply(mF).floor();
  }
}
