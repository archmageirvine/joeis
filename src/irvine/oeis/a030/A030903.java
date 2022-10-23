package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030903 [ exp(9/16)*n! ].
 * @author Sean A. Irvine
 */
public class A030903 extends Sequence1 {

  private static final CR EXP9_16 = CR.valueOf(new Q(9, 16)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP9_16.multiply(mF).floor();
  }
}
