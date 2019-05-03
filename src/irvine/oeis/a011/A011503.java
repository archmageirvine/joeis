package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011503 Decimal expansion of <code>84th</code> root of 84.
 * @author Sean A. Irvine
 */
public class A011503 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(84);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
