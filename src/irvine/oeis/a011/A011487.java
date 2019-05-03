package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011487 Decimal expansion of <code>68th</code> root of 68.
 * @author Sean A. Irvine
 */
public class A011487 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(68);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
