package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011443 Decimal expansion of <code>24th</code> root of 24.
 * @author Sean A. Irvine
 */
public class A011443 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(24);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
