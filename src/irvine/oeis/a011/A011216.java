package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011216 Decimal expansion of 7th root of 6.
 * @author Sean A. Irvine
 */
public class A011216 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.SIX, CR.SEVEN.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
