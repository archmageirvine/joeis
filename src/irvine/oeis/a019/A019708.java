package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019708 Decimal expansion of <code>sqrt(Pi)/6</code>.
 * @author Sean A. Irvine
 */
public class A019708 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(6));

  @Override
  protected CR getCR() {
    return N;
  }
}
