package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030856 [ exp(9/20)*n! ].
 * @author Sean A. Irvine
 */
public class A030856 extends Sequence1 {

  private static final CR EXP9_20 = CR.valueOf(new Q(9, 20)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP9_20.multiply(mF).floor();
  }
}
