package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030815 <code>a(n) = floor(exp(14/23) * n!)</code>.
 * @author Sean A. Irvine
 */
public class A030815 implements Sequence {

  private static final CR EXP14_23 = CR.valueOf(new Q(14, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return EXP14_23.multiply(mF).floor();
  }
}
