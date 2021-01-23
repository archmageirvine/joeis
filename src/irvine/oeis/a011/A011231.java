package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011231 Decimal expansion of 7th root of 7.
 * @author Sean A. Irvine
 */
public class A011231 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.SEVEN, CR.SEVEN.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
