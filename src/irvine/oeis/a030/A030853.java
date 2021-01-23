package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030853 [ exp(17/20)*n! ].
 * @author Sean A. Irvine
 */
public class A030853 implements Sequence {

  private static final CR EXP17_20 = CR.valueOf(new Q(17, 20)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP17_20.multiply(mF).floor();
  }
}
