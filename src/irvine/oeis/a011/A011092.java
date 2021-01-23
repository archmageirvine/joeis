package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011092 Decimal expansion of 5th root of 7.
 * @author Sean A. Irvine
 */
public class A011092 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.SEVEN, CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
