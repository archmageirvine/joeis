package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030910 <code>[ exp(11/15)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030910 implements Sequence {

  private static final CR EXP11_15 = CR.valueOf(new Q(11, 15)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP11_15.multiply(mF).floor();
  }
}
