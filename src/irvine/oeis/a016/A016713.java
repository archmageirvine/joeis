package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016713 Decimal expansion of log(90).
 * @author Sean A. Irvine
 */
public class A016713 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(90).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
