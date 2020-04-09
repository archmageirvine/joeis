package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030808 <code>a(n) = floor(exp(21/23) * n!)</code>.
 * @author Sean A. Irvine
 */
public class A030808 implements Sequence {

  private static final CR EXP21_23 = CR.valueOf(new Q(21, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP21_23.multiply(mF).floor();
  }
}
