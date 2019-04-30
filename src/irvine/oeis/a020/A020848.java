package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020848 Decimal expansion of <code>1/sqrt(91)</code>.
 * @author Sean A. Irvine
 */
public class A020848 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(91).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
