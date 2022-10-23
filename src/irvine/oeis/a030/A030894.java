package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030894 [ exp(6/17)*n! ].
 * @author Sean A. Irvine
 */
public class A030894 extends Sequence1 {

  private static final CR EXP6_17 = CR.valueOf(new Q(6, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP6_17.multiply(mF).floor();
  }
}
