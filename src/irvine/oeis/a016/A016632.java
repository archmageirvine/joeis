package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016632 Decimal expansion of log(9).
 * @author Sean A. Irvine
 */
public class A016632 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log();

  @Override
  protected CR getCR() {
    return N;
  }
}
