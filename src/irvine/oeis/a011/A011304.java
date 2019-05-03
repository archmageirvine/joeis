package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011304 Decimal expansion of <code>20th</code> root of 11.
 * @author Sean A. Irvine
 */
public class A011304 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.valueOf(20).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
