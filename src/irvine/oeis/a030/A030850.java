package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030850 [ exp(2/21)*n! ].
 * @author Sean A. Irvine
 */
public class A030850 implements Sequence {

  private static final CR EXP2_21 = CR.valueOf(new Q(2, 21)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_21.multiply(mF).floor();
  }
}
