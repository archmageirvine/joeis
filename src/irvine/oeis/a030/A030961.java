package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030961 [ exp(1/8)*n! ].
 * @author Sean A. Irvine
 */
public class A030961 implements Sequence {

  private static final CR EXP1_8 = CR.valueOf(new Q(1, 8)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_8.multiply(mF).floor();
  }
}
