package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011462 Decimal expansion of 43rd root of 43.
 * @author Sean A. Irvine
 */
public class A011462 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(43);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
