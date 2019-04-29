package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020779 Decimal expansion of <code>1/sqrt(22)</code>.
 * @author Sean A. Irvine
 */
public class A020779 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
