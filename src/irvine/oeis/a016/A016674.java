package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016674 Decimal expansion of log(51).
 * @author Sean A. Irvine
 */
public class A016674 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(51).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
