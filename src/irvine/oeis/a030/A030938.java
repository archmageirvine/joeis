package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030938 Floor(exp(10/11)*n!).
 * @author Sean A. Irvine
 */
public class A030938 extends Sequence1 {

  private static final CR EXP10_11 = CR.valueOf(new Q(10, 11)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP10_11.multiply(mF).floor();
  }
}
