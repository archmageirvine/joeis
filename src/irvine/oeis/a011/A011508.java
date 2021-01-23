package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011508 Decimal expansion of 89th root of 89.
 * @author Sean A. Irvine
 */
public class A011508 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(89);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
