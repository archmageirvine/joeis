package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155823 Decimal expansion of log_6 (23).
 * @author Sean A. Irvine
 */
public class A155823 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
