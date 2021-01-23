package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030917 [ exp(11/14)*n! ].
 * @author Sean A. Irvine
 */
public class A030917 implements Sequence {

  private static final CR EXP11_14 = CR.valueOf(new Q(11, 14)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP11_14.multiply(mF).floor();
  }
}
