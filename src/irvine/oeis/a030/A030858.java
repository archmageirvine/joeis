package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030858 [ exp(3/20)*n! ].
 * @author Sean A. Irvine
 */
public class A030858 implements Sequence {

  private static final CR EXP3_20 = CR.valueOf(new Q(3, 20)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP3_20.multiply(mF).floor();
  }
}
