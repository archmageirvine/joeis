package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030967 [ exp(1/7)*n! ].
 * @author Sean A. Irvine
 */
public class A030967 implements Sequence {

  private static final CR EXP1_7 = CR.valueOf(new Q(1, 7)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_7.multiply(mF).floor();
  }
}
