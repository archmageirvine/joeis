package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030804 a(n) = floor(exp(7/24)*n!).
 * @author Sean A. Irvine
 */
public class A030804 implements Sequence {

  private static final CR EXP7_24 = CR.valueOf(new Q(7, 24)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_24.multiply(mF).floor();
  }
}
