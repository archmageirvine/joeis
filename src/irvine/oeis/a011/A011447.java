package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011447 Decimal expansion of <code>28th</code> root of 28.
 * @author Sean A. Irvine
 */
public class A011447 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(28);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
