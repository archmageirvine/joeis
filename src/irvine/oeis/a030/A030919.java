package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030919 [ exp(5/14)*n! ].
 * @author Sean A. Irvine
 */
public class A030919 extends Sequence1 {

  private static final CR EXP5_14 = CR.valueOf(new Q(5, 14)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP5_14.multiply(mF).floor();
  }
}
