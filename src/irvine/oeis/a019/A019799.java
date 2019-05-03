package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019799 Decimal expansion of <code>sqrt(2*e)/3</code>.
 * @author Sean A. Irvine
 */
public class A019799 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
