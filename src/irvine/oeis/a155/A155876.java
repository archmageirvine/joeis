package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155876 Decimal expansion of log_16 (23).
 * @author Sean A. Irvine
 */
public class A155876 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.valueOf(16).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
