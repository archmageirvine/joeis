package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030975 [ exp(1/4)*n! ].
 * @author Sean A. Irvine
 */
public class A030975 implements Sequence {

  private static final CR EXP1_4 = CR.valueOf(Q.ONE_QUARTER).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_4.multiply(mF).floor();
  }
}
