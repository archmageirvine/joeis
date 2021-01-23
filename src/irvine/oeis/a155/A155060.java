package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155060 Decimal expansion of log_8 (19).
 * @author Sean A. Irvine
 */
public class A155060 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
