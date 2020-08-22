package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011515 Decimal expansion of 96th root of 96.
 * @author Sean A. Irvine
 */
public class A011515 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(96);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
