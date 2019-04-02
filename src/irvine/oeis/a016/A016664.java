package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016664 Decimal expansion of log(41).
 * @author Sean A. Irvine
 */
public class A016664 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(41).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
