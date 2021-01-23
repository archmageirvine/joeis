package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019798 Decimal expansion of sqrt(2*e).
 * @author Sean A. Irvine
 */
public class A019798 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
