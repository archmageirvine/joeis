package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020852 Decimal expansion of <code>1/sqrt(95)</code>.
 * @author Sean A. Irvine
 */
public class A020852 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(95).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
