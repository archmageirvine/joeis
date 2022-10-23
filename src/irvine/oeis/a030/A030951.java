package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030951 [ exp(1/10)*n! ].
 * @author Sean A. Irvine
 */
public class A030951 extends Sequence1 {

  private static final CR EXP1_10 = CR.valueOf(new Q(1, 10)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_10.multiply(mF).floor();
  }
}
