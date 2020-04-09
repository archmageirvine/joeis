package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030918 <code>[ exp(9/14)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030918 implements Sequence {

  private static final CR EXP9_14 = CR.valueOf(new Q(9, 14)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP9_14.multiply(mF).floor();
  }
}
