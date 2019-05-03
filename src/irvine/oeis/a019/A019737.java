package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019737 Decimal expansion of <code>sqrt(2*Pi)/21</code>.
 * @author Sean A. Irvine
 */
public class A019737 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return N;
  }
}
