package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030891 [ exp(9/17)*n! ].
 * @author Sean A. Irvine
 */
public class A030891 implements Sequence {

  private static final CR EXP9_17 = CR.valueOf(new Q(9, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP9_17.multiply(mF).floor();
  }
}
