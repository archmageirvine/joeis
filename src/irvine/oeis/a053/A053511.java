package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A053511 Decimal expansion of <code>log_10 (Pi)</code>.
 * @author Sean A. Irvine
 */
public class A053511 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.log().divide(CR.valueOf(10).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
