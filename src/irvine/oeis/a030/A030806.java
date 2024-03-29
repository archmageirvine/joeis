package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030806 a(n) = floor(exp(1/24)*n!).
 * @author Sean A. Irvine
 */
public class A030806 extends Sequence1 {

  private static final CR EXP1_24 = CR.valueOf(new Q(1, 24)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_24.multiply(mF).floor();
  }
}
