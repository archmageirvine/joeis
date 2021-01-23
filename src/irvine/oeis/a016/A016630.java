package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016630 Decimal expansion of log(7).
 * @author Sean A. Irvine
 */
public class A016630 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log();

  @Override
  protected CR getCR() {
    return N;
  }
}
