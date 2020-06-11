package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140247 Decimal expansion of <code>8/sqrt(15)</code>.
 * @author Sean A. Irvine
 */
public class A140247 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.divide(CR.valueOf(15).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
