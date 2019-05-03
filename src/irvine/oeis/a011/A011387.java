package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011387 Decimal expansion of <code>13th</code> root of 17.
 * @author Sean A. Irvine
 */
public class A011387 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(13).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
