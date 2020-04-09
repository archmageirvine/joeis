package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030876 <code>[ exp(2/19)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030876 implements Sequence {

  private static final CR EXP2_19 = CR.valueOf(new Q(2, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP2_19.multiply(mF).floor();
  }
}
