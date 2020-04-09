package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030914 <code>[ exp(2/15)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030914 implements Sequence {

  private static final CR EXP2_15 = CR.valueOf(new Q(2, 15)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_15.multiply(mF).floor();
  }
}
