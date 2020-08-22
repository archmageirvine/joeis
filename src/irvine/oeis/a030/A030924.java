package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030924 [ exp(10/13)*n! ].
 * @author Sean A. Irvine
 */
public class A030924 implements Sequence {

  private static final CR EXP10_13 = CR.valueOf(new Q(10, 13)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP10_13.multiply(mF).floor();
  }
}
