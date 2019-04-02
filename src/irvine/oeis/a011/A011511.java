package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011511 Decimal expansion of 92nd root of 92.
 * @author Sean A. Irvine
 */
public class A011511 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(92);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
