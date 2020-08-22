package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016666 Decimal expansion of log(43).
 * @author Sean A. Irvine
 */
public class A016666 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(43).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
