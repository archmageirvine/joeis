package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030963 a(n) = floor( exp(5/7)*n! ).
 * @author Sean A. Irvine
 */
public class A030963 implements Sequence {

  private static final CR EXP5_7 = CR.valueOf(new Q(5, 7)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP5_7.multiply(mF).floor();
  }
}
