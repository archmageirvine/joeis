package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030844 Floor( exp(13/21)*n! ).
 * @author Sean A. Irvine
 */
public class A030844 implements Sequence {

  private static final CR EXP13_21 = CR.valueOf(new Q(13, 21)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP13_21.multiply(mF).floor();
  }
}
