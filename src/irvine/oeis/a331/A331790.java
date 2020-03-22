package irvine.oeis.a331;

import irvine.math.cr.CR;
import irvine.oeis.a264.A264808;

/**
 * A331790 Decimal expansion of the solution to <code>x*e^(x*e^(x))=1</code>.
 * @author Sean A. Irvine
 */
public class A331790 extends A264808 {

  private final CR mN = super.getCR().log();

  @Override
  protected CR getCR() {
    return mN;
  }
}

