package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011273 Decimal expansion of <code>19th</code> root of 9.
 * @author Sean A. Irvine
 */
public class A011273 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(9), CR.valueOf(19).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
