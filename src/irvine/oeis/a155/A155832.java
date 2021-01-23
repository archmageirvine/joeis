package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155832 Decimal expansion of log_12 (23).
 * @author Sean A. Irvine
 */
public class A155832 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.valueOf(12).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
