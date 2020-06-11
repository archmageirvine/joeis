package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019731 Decimal expansion of <code>sqrt(2*Pi)/9</code>.
 * @author Sean A. Irvine
 */
public class A019731 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.NINE);

  @Override
  protected CR getCR() {
    return N;
  }
}
