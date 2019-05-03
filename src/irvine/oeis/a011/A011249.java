package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011249 Decimal expansion of <code>10th</code> root of 8.
 * @author Sean A. Irvine
 */
public class A011249 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(8), CR.valueOf(10).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
