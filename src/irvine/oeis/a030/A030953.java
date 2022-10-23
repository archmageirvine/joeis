package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030953 [ exp(7/9)*n! ].
 * @author Sean A. Irvine
 */
public class A030953 extends Sequence1 {

  private static final CR EXP7_9 = CR.valueOf(new Q(7, 9)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_9.multiply(mF).floor();
  }
}
