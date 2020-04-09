package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030898 <code>[ exp(2/17)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030898 implements Sequence {

  private static final CR EXP2_17 = CR.valueOf(new Q(2, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_17.multiply(mF).floor();
  }
}
