package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011347 Decimal expansion of <code>18th</code> root of 14.
 * @author Sean A. Irvine
 */
public class A011347 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
