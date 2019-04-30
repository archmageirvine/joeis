package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020822 Decimal expansion of <code>1/sqrt(65)</code>.
 * @author Sean A. Irvine
 */
public class A020822 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(65).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
