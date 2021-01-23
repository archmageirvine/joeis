package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155502 Decimal expansion of log_8 (20).
 * @author Sean A. Irvine
 */
public class A155502 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
