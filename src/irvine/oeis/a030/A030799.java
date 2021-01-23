package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030799 a(n) = floor(exp(1/2)*n!).
 * @author Sean A. Irvine
 */
public class A030799 implements Sequence {

  private static final CR EXP_HALF = CR.HALF.exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP_HALF.multiply(mF).floor();
  }
}
