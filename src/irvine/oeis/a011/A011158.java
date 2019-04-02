package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011158 Decimal expansion of 5th root of 73.
 * @author Sean A. Irvine
 */
public class A011158 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(73), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
