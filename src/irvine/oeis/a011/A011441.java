package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011441 Decimal expansion of 22nd root of 22.
 * @author Sean A. Irvine
 */
public class A011441 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(22);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
