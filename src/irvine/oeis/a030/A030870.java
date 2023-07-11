package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030870 [ exp(8/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030870 extends Sequence0 {

  private static final CR EXP8_19 = CR.valueOf(new Q(8, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP8_19.multiply(mF).floor();
  }
}
