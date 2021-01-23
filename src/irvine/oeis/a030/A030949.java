package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030949 [ exp(7/10)*n! ].
 * @author Sean A. Irvine
 */
public class A030949 implements Sequence {

  private static final CR EXP7_10 = CR.valueOf(new Q(7, 10)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_10.multiply(mF).floor();
  }
}
