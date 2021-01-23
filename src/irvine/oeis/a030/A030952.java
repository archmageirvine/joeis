package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030952 [ exp(8/9)*n! ].
 * @author Sean A. Irvine
 */
public class A030952 implements Sequence {

  private static final CR EXP8_9 = CR.valueOf(new Q(8, 9)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP8_9.multiply(mF).floor();
  }
}
