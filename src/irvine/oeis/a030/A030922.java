package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030922 [ exp(12/13)*n! ].
 * @author Sean A. Irvine
 */
public class A030922 implements Sequence {

  private static final CR EXP12_13 = CR.valueOf(new Q(12, 13)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP12_13.multiply(mF).floor();
  }
}
