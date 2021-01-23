package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019609 Decimal expansion of Pi*e.
 * @author Sean A. Irvine
 */
public class A019609 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
