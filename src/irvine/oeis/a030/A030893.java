package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030893 a(n) = floor( exp(7/17)*n! ).
 * @author Sean A. Irvine
 */
public class A030893 implements Sequence {

  private static final CR EXP7_17 = CR.valueOf(new Q(7, 17)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP7_17.multiply(mF).floor();
  }
}
