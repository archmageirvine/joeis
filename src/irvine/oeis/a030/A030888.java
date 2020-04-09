package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030888 <code>[ exp(12/17)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030888 implements Sequence {

  private static final CR EXP12_17 = CR.valueOf(new Q(12, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP12_17.multiply(mF).floor();
  }
}
