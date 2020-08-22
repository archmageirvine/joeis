package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019779 Decimal expansion of sqrt(e)/6.
 * @author Sean A. Irvine
 */
public class A019779 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
