package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030874 [ exp(4/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030874 extends Sequence1 {

  private static final CR EXP4_19 = CR.valueOf(new Q(4, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP4_19.multiply(mF).floor();
  }
}
