package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011449 Decimal expansion of <code>30th</code> root of 30.
 * @author Sean A. Irvine
 */
public class A011449 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(30);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
