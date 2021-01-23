package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019782 Decimal expansion of sqrt(e)/9.
 * @author Sean A. Irvine
 */
public class A019782 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.NINE);

  @Override
  protected CR getCR() {
    return N;
  }
}
