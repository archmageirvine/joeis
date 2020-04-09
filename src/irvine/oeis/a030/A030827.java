package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030827 <code>[ exp(2/23)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030827 implements Sequence {

  private static final CR EXP2_23 = CR.valueOf(new Q(2, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_23.multiply(mF).floor();
  }
}
