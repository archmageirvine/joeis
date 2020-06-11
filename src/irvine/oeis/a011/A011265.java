package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011265 Decimal expansion of <code>11th</code> root of 9.
 * @author Sean A. Irvine
 */
public class A011265 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.NINE, CR.valueOf(11).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
