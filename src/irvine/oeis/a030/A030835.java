package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030835 [ exp(7/22)*n! ].
 * @author Sean A. Irvine
 */
public class A030835 implements Sequence {

  private static final CR EXP7_22 = CR.valueOf(new Q(7, 22)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_22.multiply(mF).floor();
  }
}
