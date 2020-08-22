package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019781 Decimal expansion of sqrt(e)/8.
 * @author Sean A. Irvine
 */
public class A019781 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.EIGHT);

  @Override
  protected CR getCR() {
    return N;
  }
}
