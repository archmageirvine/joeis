package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030892 [ exp(8/17)*n! ].
 * @author Sean A. Irvine
 */
public class A030892 implements Sequence {

  private static final CR EXP8_17 = CR.valueOf(new Q(8, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP8_17.multiply(mF).floor();
  }
}
