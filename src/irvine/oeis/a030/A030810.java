package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030810 <code>Floor(exp(19/23) * n!)</code>.
 * @author Sean A. Irvine
 */
public class A030810 implements Sequence {

  private static final CR EXP19_23 = CR.valueOf(new Q(19, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP19_23.multiply(mF).floor();
  }
}
