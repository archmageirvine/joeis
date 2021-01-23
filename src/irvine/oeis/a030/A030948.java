package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030948 [ exp(9/10)*n! ].
 * @author Sean A. Irvine
 */
public class A030948 implements Sequence {

  private static final CR EXP9_10 = CR.valueOf(new Q(9, 10)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP9_10.multiply(mF).floor();
  }
}
