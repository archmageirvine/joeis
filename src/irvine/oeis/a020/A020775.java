package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020775 Decimal expansion of <code>1/sqrt(18)</code>.
 * @author Sean A. Irvine
 */
public class A020775 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
