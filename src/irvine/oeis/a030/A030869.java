package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030869 [ exp(9/19)*n! ].
 * @author Sean A. Irvine
 */
public class A030869 implements Sequence {

  private static final CR EXP9_19 = CR.valueOf(new Q(9, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP9_19.multiply(mF).floor();
  }
}
