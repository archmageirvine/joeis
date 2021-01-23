package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016680 Decimal expansion of log(57).
 * @author Sean A. Irvine
 */
public class A016680 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(57).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
