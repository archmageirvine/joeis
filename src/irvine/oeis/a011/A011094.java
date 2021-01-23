package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011094 Decimal expansion of 5th root of 9.
 * @author Sean A. Irvine
 */
public class A011094 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.NINE, CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
