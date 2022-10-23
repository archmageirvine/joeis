package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030932 [ exp(2/13)*n! ].
 * @author Sean A. Irvine
 */
public class A030932 extends Sequence1 {

  private static final CR EXP2_13 = CR.valueOf(new Q(2, 13)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_13.multiply(mF).floor();
  }
}
