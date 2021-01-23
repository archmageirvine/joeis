package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030947 [ exp(1/11)*n! ].
 * @author Sean A. Irvine
 */
public class A030947 implements Sequence {

  private static final CR EXP1_11 = CR.valueOf(new Q(1, 11)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_11.multiply(mF).floor();
  }
}
