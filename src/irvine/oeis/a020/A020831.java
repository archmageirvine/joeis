package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020831 Decimal expansion of <code>1/sqrt(74)</code>.
 * @author Sean A. Irvine
 */
public class A020831 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(74).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
