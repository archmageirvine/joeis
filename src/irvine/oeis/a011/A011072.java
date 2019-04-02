package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011072 Decimal expansion of 4th root of 80.
 * @author Sean A. Irvine
 */
public class A011072 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(80), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
