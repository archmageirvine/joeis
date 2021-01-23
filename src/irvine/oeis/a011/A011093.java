package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011093 Decimal expansion of 5th root of 8.
 * @author Sean A. Irvine
 */
public class A011093 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.EIGHT, CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
