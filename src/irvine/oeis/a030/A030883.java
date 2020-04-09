package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030883 <code>[ exp(1/18)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030883 implements Sequence {

  private static final CR EXP1_18 = CR.valueOf(new Q(1, 18)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_18.multiply(mF).floor();
  }
}
