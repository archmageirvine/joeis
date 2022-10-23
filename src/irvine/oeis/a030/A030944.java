package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030944 [ exp(4/11)*n! ].
 * @author Sean A. Irvine
 */
public class A030944 extends Sequence1 {

  private static final CR EXP4_11 = CR.valueOf(new Q(4, 11)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP4_11.multiply(mF).floor();
  }
}
