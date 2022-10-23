package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030930 [ exp(4/13)*n! ].
 * @author Sean A. Irvine
 */
public class A030930 extends Sequence1 {

  private static final CR EXP4_13 = CR.valueOf(new Q(4, 13)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP4_13.multiply(mF).floor();
  }
}
