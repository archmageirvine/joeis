package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030937 [ exp(1/12)*n! ].
 * @author Sean A. Irvine
 */
public class A030937 extends Sequence1 {

  private static final CR EXP1_12 = CR.valueOf(new Q(1, 12)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_12.multiply(mF).floor();
  }
}
