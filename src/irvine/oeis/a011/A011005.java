package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011005 Decimal expansion of 4th root of 7.
 * @author Sean A. Irvine
 */
public class A011005 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.SEVEN, CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
