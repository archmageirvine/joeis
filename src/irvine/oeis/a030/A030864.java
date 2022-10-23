package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030864 [ exp(14/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030864 extends Sequence1 {

  private static final CR EXP14_19 = CR.valueOf(new Q(14, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP14_19.multiply(mF).floor();
  }
}
