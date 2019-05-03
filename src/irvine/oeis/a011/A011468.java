package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011468 Decimal expansion of <code>49th</code> root of 49.
 * @author Sean A. Irvine
 */
public class A011468 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(49);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
