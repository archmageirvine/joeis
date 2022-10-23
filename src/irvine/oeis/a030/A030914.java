package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030914 [ exp(2/15)*n! ].
 * @author Sean A. Irvine
 */
public class A030914 extends Sequence1 {

  private static final CR EXP2_15 = CR.valueOf(new Q(2, 15)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_15.multiply(mF).floor();
  }
}
