package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030977 <code>a(n) = floor(exp(1/3)*n!)</code>.
 * @author Sean A. Irvine
 */
public class A030977 implements Sequence {

  private static final CR EXP1_3 = CR.valueOf(Q.ONE_THIRD).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_3.multiply(mF).floor();
  }
}
