package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011326 Decimal expansion of <code>12th</code> root of 13.
 * @author Sean A. Irvine
 */
public class A011326 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(12).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
