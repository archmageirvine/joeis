package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011459 Decimal expansion of 40th root of 40.
 * @author Sean A. Irvine
 */
public class A011459 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(40);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
