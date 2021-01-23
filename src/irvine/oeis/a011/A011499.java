package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011499 Decimal expansion of 80th root of 80.
 * @author Sean A. Irvine
 */
public class A011499 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(80);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
