package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019714 Decimal expansion of sqrt(Pi)/12.
 * @author Sean A. Irvine
 */
public class A019714 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
