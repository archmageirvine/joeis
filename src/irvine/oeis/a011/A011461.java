package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011461 Decimal expansion of 42nd root of 42.
 * @author Sean A. Irvine
 */
public class A011461 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(42);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
