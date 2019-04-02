package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019759 Decimal expansion of e/22.
 * @author Sean A. Irvine
 */
public class A019759 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(22));

  @Override
  protected CR getCR() {
    return N;
  }
}
