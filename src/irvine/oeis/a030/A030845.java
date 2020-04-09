package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030845 <code>[ exp(11/21)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030845 implements Sequence {

  private static final CR EXP11_21 = CR.valueOf(new Q(11, 21)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP11_21.multiply(mF).floor();
  }
}
