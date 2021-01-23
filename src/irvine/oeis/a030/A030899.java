package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030899 [ exp(1/17)*n! ].
 * @author Sean A. Irvine
 */
public class A030899 implements Sequence {

  private static final CR EXP1_17 = CR.valueOf(new Q(1, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_17.multiply(mF).floor();
  }
}
