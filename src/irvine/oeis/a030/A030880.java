package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030880 <code>a(n) = floor( exp(11/18)*n! )</code>.
 * @author Sean A. Irvine
 */
public class A030880 implements Sequence {

  private static final CR EXP11_18 = CR.valueOf(new Q(11, 18)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP11_18.multiply(mF).floor();
  }
}
