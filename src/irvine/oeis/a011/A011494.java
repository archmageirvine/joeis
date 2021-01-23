package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011494 Decimal expansion of 75th root of 75.
 * @author Sean A. Irvine
 */
public class A011494 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(75);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
