package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030842 [ exp(17/21)*n! ].
 * @author Sean A. Irvine
 */
public class A030842 implements Sequence {

  private static final CR EXP17_21 = CR.valueOf(new Q(17, 21)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP17_21.multiply(mF).floor();
  }
}
