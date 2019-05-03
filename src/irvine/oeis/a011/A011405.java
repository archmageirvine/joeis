package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011405 Decimal expansion of <code>16th</code> root of 18.
 * @author Sean A. Irvine
 */
public class A011405 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(16).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
