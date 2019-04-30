package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020805 Decimal expansion of <code>1/sqrt(48)</code>.
 * @author Sean A. Irvine
 */
public class A020805 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(48).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
