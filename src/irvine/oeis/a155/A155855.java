package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155855 Decimal expansion of log_15 (23).
 * @author Sean A. Irvine
 */
public class A155855 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
