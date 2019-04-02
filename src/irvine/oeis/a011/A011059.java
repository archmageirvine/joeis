package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011059 Decimal expansion of 4th root of 67.
 * @author Sean A. Irvine
 */
public class A011059 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(67), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
