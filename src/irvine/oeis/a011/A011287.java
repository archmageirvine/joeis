package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011287 Decimal expansion of 18th root of 10.
 * @author Sean A. Irvine
 */
public class A011287 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TEN, CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
