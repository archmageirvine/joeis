package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011467 Decimal expansion of 48th root of 48.
 * @author Sean A. Irvine
 */
public class A011467 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(48);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
