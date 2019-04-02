package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002163 Decimal expansion of square root of 5.
 * @author Sean A. Irvine
 */
public class A002163 extends DecimalExpansionSequence {

  private static final CR SQRT5 = CR.FIVE.sqrt();

  @Override
  protected CR getCR() {
    return SQRT5;
  }
}
