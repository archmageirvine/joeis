package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084787 Least integer such that e^n/(ceiling(e^n) + a(n)) monotonically decreases.
 * @author Sean A. Irvine
 */
public class A084787 extends Sequence0 {

  private Z mA = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = CR.E.multiply(mA).add(CR.E.multiply(CR.valueOf(mN - 1).exp().ceil())).subtract(CR.valueOf(mN).exp().ceil()).ceil();
    }
    return mA;
  }
}
