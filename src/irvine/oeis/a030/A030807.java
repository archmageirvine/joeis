package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030807 a(n) = floor(exp(22/23) * n!).
 * @author Sean A. Irvine
 */
public class A030807 implements Sequence {

  private static final CR EXP22_23 = CR.valueOf(new Q(22, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP22_23.multiply(mF).floor();
  }
}
