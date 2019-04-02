package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019785 Decimal expansion of sqrt(e)/12.
 * @author Sean A. Irvine
 */
public class A019785 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
