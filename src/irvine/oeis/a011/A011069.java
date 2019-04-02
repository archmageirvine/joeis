package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011069 Decimal expansion of 4th root of 77.
 * @author Sean A. Irvine
 */
public class A011069 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(77), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
