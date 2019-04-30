package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020820 Decimal expansion of <code>1/sqrt(63)</code>.
 * @author Sean A. Irvine
 */
public class A020820 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(63).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
