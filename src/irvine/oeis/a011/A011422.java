package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011422 Decimal expansion of 18th root of 19.
 * @author Sean A. Irvine
 */
public class A011422 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
