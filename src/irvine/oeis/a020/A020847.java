package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020847 Decimal expansion of <code>1/sqrt(90)</code>.
 * @author Sean A. Irvine
 */
public class A020847 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(90).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
