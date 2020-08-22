package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019758 Decimal expansion of e/21.
 * @author Sean A. Irvine
 */
public class A019758 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return N;
  }
}
