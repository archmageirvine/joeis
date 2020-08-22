package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016701 Decimal expansion of log(78).
 * @author Sean A. Irvine
 */
public class A016701 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(78).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
