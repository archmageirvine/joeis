package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011472 Decimal expansion of 53rd root of 53.
 * @author Sean A. Irvine
 */
public class A011472 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(53);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
