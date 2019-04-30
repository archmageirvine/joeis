package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020818 Decimal expansion of <code>1/sqrt(61)</code>.
 * @author Sean A. Irvine
 */
public class A020818 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(61).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
