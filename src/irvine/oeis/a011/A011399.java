package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011399 Decimal expansion of <code>10th</code> root of 18.
 * @author Sean A. Irvine
 */
public class A011399 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.TEN.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
