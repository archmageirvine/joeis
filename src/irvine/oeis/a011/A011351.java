package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011351 Decimal expansion of 7th root of 15.
 * @author Sean A. Irvine
 */
public class A011351 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.SEVEN.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
