package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005534 Decimal expansion of fifth root of 5.
 * @author Sean A. Irvine
 */
public class A005534 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FIVE, CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
