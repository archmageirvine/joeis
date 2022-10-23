package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030958 [ exp(7/8)*n! ].
 * @author Sean A. Irvine
 */
public class A030958 extends Sequence1 {

  private static final CR EXP7_8 = CR.valueOf(new Q(7, 8)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_8.multiply(mF).floor();
  }
}
