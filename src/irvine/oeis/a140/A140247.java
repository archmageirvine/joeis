package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140247 Decimal expansion of 8/sqrt(15).
 * @author Sean A. Irvine
 */
public class A140247 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(8).divide(CR.valueOf(15).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
