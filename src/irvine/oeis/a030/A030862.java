package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030862 [ exp(16/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030862 implements Sequence {

  private static final CR EXP16_19 = CR.valueOf(new Q(16, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP16_19.multiply(mF).floor();
  }
}
