package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019735 Decimal expansion of <code>sqrt(2*Pi)/17</code>.
 * @author Sean A. Irvine
 */
public class A019735 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.valueOf(17));

  @Override
  protected CR getCR() {
    return N;
  }
}
