package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030861 [ exp(17/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030861 extends Sequence1 {

  private static final CR EXP17_19 = CR.valueOf(new Q(17, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP17_19.multiply(mF).floor();
  }
}
