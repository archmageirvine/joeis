package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030866 [ exp(12/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030866 extends Sequence1 {

  private static final CR EXP12_19 = CR.valueOf(new Q(12, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP12_19.multiply(mF).floor();
  }
}
