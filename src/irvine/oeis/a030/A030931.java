package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030931 <code>[ exp(3/13)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030931 implements Sequence {

  private static final CR EXP3_13 = CR.valueOf(new Q(3, 13)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP3_13.multiply(mF).floor();
  }
}
