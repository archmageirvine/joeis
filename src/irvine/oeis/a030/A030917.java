package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030917 [ exp(11/14)*n! ].
 * @author Sean A. Irvine
 */
public class A030917 extends Sequence1 {

  private static final CR EXP11_14 = CR.valueOf(new Q(11, 14)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP11_14.multiply(mF).floor();
  }
}
