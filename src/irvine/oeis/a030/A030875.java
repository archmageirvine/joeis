package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030875 [ exp(3/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030875 implements Sequence {

  private static final CR EXP3_19 = CR.valueOf(new Q(3, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP3_19.multiply(mF).floor();
  }
}
