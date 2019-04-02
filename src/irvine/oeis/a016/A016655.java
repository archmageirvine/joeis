package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016655 Decimal expansion of log(32) = 5*log(2).
 * @author Sean A. Irvine
 */
public class A016655 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(32).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
