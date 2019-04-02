package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005533 Decimal expansion of fifth root of 4.
 * @author Sean A. Irvine
 */
public class A005533 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FOUR, CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
