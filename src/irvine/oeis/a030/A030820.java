package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030820 <code>[ exp(9/23)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030820 implements Sequence {

  private static final CR EXP9_23 = CR.valueOf(new Q(9, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP9_23.multiply(mF).floor();
  }
}
