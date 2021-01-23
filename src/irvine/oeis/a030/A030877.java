package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030877 [ exp(1/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030877 implements Sequence {

  private static final CR EXP1_19 = CR.valueOf(new Q(1, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_19.multiply(mF).floor();
  }
}
