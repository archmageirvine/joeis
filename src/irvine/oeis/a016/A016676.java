package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016676 Decimal expansion of log(53).
 * @author Sean A. Irvine
 */
public class A016676 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(53).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
