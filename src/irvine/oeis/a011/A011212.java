package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011212 Decimal expansion of 18th root of 5.
 * @author Sean A. Irvine
 */
public class A011212 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
