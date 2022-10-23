package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030803 a(n) = floor(exp(11/24)*n!).
 * @author Sean A. Irvine
 */
public class A030803 extends Sequence1 {

  private static final CR EXP11_24 = CR.valueOf(new Q(11, 24)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP11_24.multiply(mF).floor();
  }
}
