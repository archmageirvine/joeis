package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030973 [ exp(1/5)*n! ].
 * @author Sean A. Irvine
 */
public class A030973 implements Sequence {

  private static final CR EXP1_5 = CR.valueOf(new Q(1, 5)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_5.multiply(mF).floor();
  }
}
