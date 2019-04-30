package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020846 Decimal expansion of <code>1/sqrt(89)</code>.
 * @author Sean A. Irvine
 */
public class A020846 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(89).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
