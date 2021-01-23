package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030855 [ exp(11/20)*n! ].
 * @author Sean A. Irvine
 */
public class A030855 implements Sequence {

  private static final CR EXP11_20 = CR.valueOf(new Q(11, 20)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP11_20.multiply(mF).floor();
  }
}
