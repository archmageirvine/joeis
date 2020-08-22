package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030884 [ exp(16/17)*n! ].
 * @author Sean A. Irvine
 */
public class A030884 implements Sequence {

  private static final CR EXP16_17 = CR.valueOf(new Q(16, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP16_17.multiply(mF).floor();
  }
}
