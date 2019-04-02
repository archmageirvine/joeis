package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005531 Decimal expansion of fifth root of 2.
 * @author Sean A. Irvine
 */
public class A005531 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
