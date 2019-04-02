package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019727 Decimal expansion of sqrt(2*Pi).
 * @author Sean A. Irvine
 */
public class A019727 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
