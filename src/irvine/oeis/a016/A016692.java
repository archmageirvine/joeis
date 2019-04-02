package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016692 Decimal expansion of log(69).
 * @author Sean A. Irvine
 */
public class A016692 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(69).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
