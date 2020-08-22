package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030887 [ exp(13/17)*n! ].
 * @author Sean A. Irvine
 */
public class A030887 implements Sequence {

  private static final CR EXP13_17 = CR.valueOf(new Q(13, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP13_17.multiply(mF).floor();
  }
}
