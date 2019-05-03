package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011505 Decimal expansion of <code>86th</code> root of 86.
 * @author Sean A. Irvine
 */
public class A011505 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(86);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
