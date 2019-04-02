package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020862 Decimal expansion of log_2(10).
 * @author Sean A. Irvine
 */
public class A020862 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
