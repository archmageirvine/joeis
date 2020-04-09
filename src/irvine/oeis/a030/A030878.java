package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030878 <code>[ exp(17/18)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030878 implements Sequence {

  private static final CR EXP17_18 = CR.valueOf(new Q(17, 18)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP17_18.multiply(mF).floor();
  }
}
