package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030829 [ exp(21/22)*n! ].
 * @author Sean A. Irvine
 */
public class A030829 extends Sequence1 {

  private static final CR EXP21_22 = CR.valueOf(new Q(21, 22)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP21_22.multiply(mF).floor();
  }
}
