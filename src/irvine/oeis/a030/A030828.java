package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030828 [ exp(1/23)*n! ].
 * @author Sean A. Irvine
 */
public class A030828 extends Sequence1 {

  private static final CR EXP1_23 = CR.valueOf(new Q(1, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_23.multiply(mF).floor();
  }
}
