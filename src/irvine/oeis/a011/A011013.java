package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011013 Decimal expansion of 4th root of 17.
 * @author Sean A. Irvine
 */
public class A011013 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
