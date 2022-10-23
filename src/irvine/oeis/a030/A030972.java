package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030972 [ exp(2/5)*n! ].
 * @author Sean A. Irvine
 */
public class A030972 extends Sequence1 {

  private static final CR EXP2_5 = CR.valueOf(new Q(2, 5)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_5.multiply(mF).floor();
  }
}
