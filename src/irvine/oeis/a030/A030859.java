package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030859 <code>[ exp(1/20)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030859 implements Sequence {

  private static final CR EXP1_20 = CR.valueOf(new Q(1, 20)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP1_20.multiply(mF).floor();
  }
}
