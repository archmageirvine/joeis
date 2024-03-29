package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030945 [ exp(3/11)*n! ].
 * @author Sean A. Irvine
 */
public class A030945 extends Sequence1 {

  private static final CR EXP3_11 = CR.valueOf(new Q(3, 11)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP3_11.multiply(mF).floor();
  }
}
