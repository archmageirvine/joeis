package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030943 a(n) = floor( exp(5/11)*n! ).
 * @author Sean A. Irvine
 */
public class A030943 extends Sequence1 {

  private static final CR EXP5_11 = CR.valueOf(new Q(5, 11)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP5_11.multiply(mF).floor();
  }
}
