package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011190 Decimal expansion of <code>11th</code> root of 4.
 * @author Sean A. Irvine
 */
public class A011190 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FOUR, CR.valueOf(11).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
