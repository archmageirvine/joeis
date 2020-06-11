package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011234 Decimal expansion of <code>10th</code> root of 7.
 * @author Sean A. Irvine
 */
public class A011234 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.SEVEN, CR.TEN.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
