package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030852 [ exp(19/20)*n! ].
 * @author Sean A. Irvine
 */
public class A030852 extends Sequence1 {

  private static final CR EXP19_20 = CR.valueOf(new Q(19, 20)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP19_20.multiply(mF).floor();
  }
}
