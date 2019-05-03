package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011458 Decimal expansion of <code>39th</code> root of 39.
 * @author Sean A. Irvine
 */
public class A011458 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(39);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
