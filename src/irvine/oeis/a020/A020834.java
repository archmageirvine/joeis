package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020834 Decimal expansion of <code>1/sqrt(77)</code>.
 * @author Sean A. Irvine
 */
public class A020834 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(77).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
