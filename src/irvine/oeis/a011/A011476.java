package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011476 Decimal expansion of <code>57th</code> root of 57.
 * @author Sean A. Irvine
 */
public class A011476 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(57);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
