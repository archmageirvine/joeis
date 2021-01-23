package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011383 Decimal expansion of 9th root of 17.
 * @author Sean A. Irvine
 */
public class A011383 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.NINE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
