package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155528 Decimal expansion of log_16 (20).
 * @author Sean A. Irvine
 */
public class A155528 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log().divide(CR.valueOf(16).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
