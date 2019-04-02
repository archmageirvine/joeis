package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011281 Decimal expansion of 12th root of 10.
 * @author Sean A. Irvine
 */
public class A011281 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(10), CR.valueOf(12).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
