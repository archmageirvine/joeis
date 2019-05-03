package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019778 Decimal expansion of <code>sqrt(e)/5</code>.
 * @author Sean A. Irvine
 */
public class A019778 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
