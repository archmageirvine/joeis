package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030871 a(n) = floor( exp(7/19)*n! ).
 * @author Sean A. Irvine
 */
public class A030871 implements Sequence {

  private static final CR EXP7_19 = CR.valueOf(new Q(7, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_19.multiply(mF).floor();
  }
}
