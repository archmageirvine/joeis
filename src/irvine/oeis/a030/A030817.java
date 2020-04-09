package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030817 <code>Floor(exp(12/23) * n!)</code>.
 * @author Sean A. Irvine
 */
public class A030817 implements Sequence {

  private static final CR EXP12_23 = CR.valueOf(new Q(12, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP12_23.multiply(mF).floor();
  }
}
