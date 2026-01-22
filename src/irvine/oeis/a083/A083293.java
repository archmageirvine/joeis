package irvine.oeis.a083;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083293 e = Sum_{n&gt;=0} a(n) / 2^n / n!.
 * @author Sean A. Irvine
 */
public class A083293 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.TWO;
    }
    final Z t = mF;
    mF = mF.multiply(mN).multiply2();
    return CR.E.multiply(mF).floor().subtract(CR.E.multiply(t).floor().multiply(2 * mN));
  }
}
