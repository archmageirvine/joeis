package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030830 [ exp(19/22)*n! ].
 * @author Sean A. Irvine
 */
public class A030830 extends Sequence1 {

  private static final CR EXP19_22 = CR.valueOf(new Q(19, 22)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP19_22.multiply(mF).floor();
  }
}
