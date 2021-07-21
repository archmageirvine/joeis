package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a006.A006206;

/**
 * A005596 Decimal expansion of Artin's constant Product_{p=prime} (1-1/(p^2-p)).
 * @author Sean A. Irvine
 */
public class A005596 extends DecimalExpansionSequence {

  private CR mA = null;

  @Override
  protected void ensureAccuracy(final int n) {
    final int acc = 4 * n; // This might not be enough
    CR prod = CR.ONE;
    final A006206 a = new A006206();
    a.next();
    for (int k = 2; k <= acc; ++k) {
      prod = prod.multiply(ComputableReals.SINGLETON.pow(Zeta.zeta(k), CR.valueOf(a.next())));
    }
    mA = prod.inverse();
  }

  @Override
  protected CR getCR() {
    return mA;
  }
}
