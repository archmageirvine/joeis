package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030908 [ exp(14/15)*n! ].
 * @author Sean A. Irvine
 */
public class A030908 implements Sequence {

  private static final CR EXP14_15 = CR.valueOf(new Q(14, 15)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP14_15.multiply(mF).floor();
  }
}
