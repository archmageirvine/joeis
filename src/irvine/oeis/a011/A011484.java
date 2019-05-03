package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011484 Decimal expansion of <code>65th</code> root of 65.
 * @author Sean A. Irvine
 */
public class A011484 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(65);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
