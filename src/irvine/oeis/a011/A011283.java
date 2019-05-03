package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011283 Decimal expansion of <code>14th</code> root of 10.
 * @author Sean A. Irvine
 */
public class A011283 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(10), CR.valueOf(14).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
