package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155675 Decimal expansion of log_8 (21).
 * @author Sean A. Irvine
 */
public class A155675 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
