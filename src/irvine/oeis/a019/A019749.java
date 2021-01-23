package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019749 Decimal expansion of e/12.
 * @author Sean A. Irvine
 */
public class A019749 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
