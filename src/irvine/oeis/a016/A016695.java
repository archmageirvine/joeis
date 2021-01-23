package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016695 Decimal expansion of log(72).
 * @author Sean A. Irvine
 */
public class A016695 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(72).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
