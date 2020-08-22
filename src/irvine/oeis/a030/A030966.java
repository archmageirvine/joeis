package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030966 [ exp(2/7)*n! ].
 * @author Sean A. Irvine
 */
public class A030966 implements Sequence {

  private static final CR EXP2_7 = CR.valueOf(new Q(2, 7)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_7.multiply(mF).floor();
  }
}
