package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030865 [ exp(13/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030865 extends Sequence1 {

  private static final CR EXP13_19 = CR.valueOf(new Q(13, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP13_19.multiply(mF).floor();
  }
}
