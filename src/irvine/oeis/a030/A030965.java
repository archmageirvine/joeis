package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030965 [ exp(3/7)*n! ].
 * @author Sean A. Irvine
 */
public class A030965 extends Sequence1 {

  private static final CR EXP3_7 = CR.valueOf(new Q(3, 7)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP3_7.multiply(mF).floor();
  }
}
