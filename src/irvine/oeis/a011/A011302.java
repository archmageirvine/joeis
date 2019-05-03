package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011302 Decimal expansion of <code>18th</code> root of 11.
 * @author Sean A. Irvine
 */
public class A011302 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
