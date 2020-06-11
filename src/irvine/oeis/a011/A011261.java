package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011261 Decimal expansion of 7th root of 9.
 * @author Sean A. Irvine
 */
public class A011261 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.NINE, CR.SEVEN.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
