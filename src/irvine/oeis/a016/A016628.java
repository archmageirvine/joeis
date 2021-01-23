package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016628 Decimal expansion of log(5).
 * @author Sean A. Irvine
 */
public class A016628 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.log();

  @Override
  protected CR getCR() {
    return N;
  }
}
