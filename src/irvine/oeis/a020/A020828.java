package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020828 Decimal expansion of <code>1/sqrt(71)</code>.
 * @author Sean A. Irvine
 */
public class A020828 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(71).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
