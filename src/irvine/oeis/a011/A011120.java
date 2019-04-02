package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011120 Decimal expansion of 5th root of 35.
 * @author Sean A. Irvine
 */
public class A011120 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(35), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
