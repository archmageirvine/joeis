package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030935 [ exp(7/12)*n! ].
 * @author Sean A. Irvine
 */
public class A030935 implements Sequence {

  private static final CR EXP7_12 = CR.valueOf(new Q(7, 12)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_12.multiply(mF).floor();
  }
}
