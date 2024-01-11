package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067840 Factorial expansion of e^2 : exp(2) = Sum_{n &gt;= 0} a(n)/n!.
 * @author Sean A. Irvine
 */
public class A067840 extends Sequence0 {

  private static final CR E2 = CR.TWO.exp();
  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.SEVEN;
    }
    final Z t = mF;
    mF = mF.multiply(mN);
    return E2.multiply(mF).floor().subtract(E2.multiply(t).floor().multiply(mN));
  }
}
