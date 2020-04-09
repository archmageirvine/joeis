package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030900 <code>[ exp(15/16)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030900 implements Sequence {

  private static final CR EXP15_16 = CR.valueOf(new Q(15, 16)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP15_16.multiply(mF).floor();
  }
}
