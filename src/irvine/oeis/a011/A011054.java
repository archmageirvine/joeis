package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011054 Decimal expansion of 4th root of 61.
 * @author Sean A. Irvine
 */
public class A011054 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(61), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
