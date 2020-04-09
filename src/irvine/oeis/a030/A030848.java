package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030848 <code>[ exp(5/21)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030848 implements Sequence {

  private static final CR EXP5_21 = CR.valueOf(new Q(5, 21)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP5_21.multiply(mF).floor();
  }
}
