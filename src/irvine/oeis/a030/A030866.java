package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030866 <code>[ exp(12/19)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030866 implements Sequence {

  private static final CR EXP12_19 = CR.valueOf(new Q(12, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP12_19.multiply(mF).floor();
  }
}
