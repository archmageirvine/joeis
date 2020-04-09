package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030823 <code>[ exp(6/23)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030823 implements Sequence {

  private static final CR EXP6_23 = CR.valueOf(new Q(6, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP6_23.multiply(mF).floor();
  }
}
