package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030971 [ exp(3/5)*n! ].
 * @author Sean A. Irvine
 */
public class A030971 implements Sequence {

  private static final CR EXP3_5 = CR.valueOf(new Q(3, 5)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP3_5.multiply(mF).floor();
  }
}
