package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030841 [ exp(19/21)*n! ].
 * @author Sean A. Irvine
 */
public class A030841 implements Sequence {

  private static final CR EXP19_21 = CR.valueOf(new Q(19, 21)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP19_21.multiply(mF).floor();
  }
}
