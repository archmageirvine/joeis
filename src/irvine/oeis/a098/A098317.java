package irvine.oeis.a098;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A098317 Decimal expansion of <code>phi^3 = 2 + sqrt(5)</code>.
 * @author Sean A. Irvine
 */
public class A098317 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.add(CR.FIVE.sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
