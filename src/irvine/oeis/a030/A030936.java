package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030936 [ exp(5/12)*n! ].
 * @author Sean A. Irvine
 */
public class A030936 implements Sequence {

  private static final CR EXP5_12 = CR.valueOf(new Q(5, 12)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP5_12.multiply(mF).floor();
  }
}
