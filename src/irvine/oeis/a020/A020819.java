package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020819 Decimal expansion of <code>1/sqrt(62)</code>.
 * @author Sean A. Irvine
 */
public class A020819 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(62).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
