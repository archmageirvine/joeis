package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019743 Decimal expansion of e/6.
 * @author Sean A. Irvine
 */
public class A019743 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
