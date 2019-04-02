package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011165 Decimal expansion of 5th root of 80.
 * @author Sean A. Irvine
 */
public class A011165 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(80), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
