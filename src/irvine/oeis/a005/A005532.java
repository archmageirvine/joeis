package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005532 Decimal expansion of fifth root of 3.
 * @author Sean A. Irvine
 */
public class A005532 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.THREE, CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
