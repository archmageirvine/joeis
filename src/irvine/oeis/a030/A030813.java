package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030813 <code>a(n) = floor(exp(16/23) * n!)</code>.
 * @author Sean A. Irvine
 */
public class A030813 implements Sequence {

  private static final CR EXP16_23 = CR.valueOf(new Q(16, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP16_23.multiply(mF).floor();
  }
}
