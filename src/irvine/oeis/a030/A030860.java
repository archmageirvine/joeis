package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030860 [ exp(18/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030860 implements Sequence {

  private static final CR EXP18_19 = CR.valueOf(new Q(18, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP18_19.multiply(mF).floor();
  }
}
