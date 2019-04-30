package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020835 Decimal expansion of <code>1/sqrt(78)</code>.
 * @author Sean A. Irvine
 */
public class A020835 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(78).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
