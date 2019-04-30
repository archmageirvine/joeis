package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020826 Decimal expansion of <code>1/sqrt(69)</code>.
 * @author Sean A. Irvine
 */
public class A020826 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(69).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
