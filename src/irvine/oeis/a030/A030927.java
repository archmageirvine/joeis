package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030927 [ exp(7/13)*n! ].
 * @author Sean A. Irvine
 */
public class A030927 implements Sequence {

  private static final CR EXP7_13 = CR.valueOf(new Q(7, 13)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_13.multiply(mF).floor();
  }
}
