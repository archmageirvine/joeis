package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011465 Decimal expansion of 46th root of 46.
 * @author Sean A. Irvine
 */
public class A011465 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(46);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
