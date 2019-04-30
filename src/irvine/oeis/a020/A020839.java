package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020839 Decimal expansion of <code>1/sqrt(82)</code>.
 * @author Sean A. Irvine
 */
public class A020839 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(82).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
