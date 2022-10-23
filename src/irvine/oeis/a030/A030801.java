package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030801 a(n) = floor(exp(17/24)*n!).
 * @author Sean A. Irvine
 */
public class A030801 extends Sequence1 {

  private static final CR EXP17_24 = CR.valueOf(new Q(17, 24)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP17_24.multiply(mF).floor();
  }
}
