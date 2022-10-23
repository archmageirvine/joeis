package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030957 [ exp(1/9)*n! ].
 * @author Sean A. Irvine
 */
public class A030957 extends Sequence1 {

  private static final CR EXP1_9 = CR.valueOf(new Q(1, 9)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_9.multiply(mF).floor();
  }
}
