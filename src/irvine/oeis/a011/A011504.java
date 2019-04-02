package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011504 Decimal expansion of 85th root of 85.
 * @author Sean A. Irvine
 */
public class A011504 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(85);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
