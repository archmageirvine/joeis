package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030872 [ exp(6/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030872 implements Sequence {

  private static final CR EXP6_19 = CR.valueOf(new Q(6, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP6_19.multiply(mF).floor();
  }
}
