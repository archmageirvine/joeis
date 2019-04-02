package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011445 Decimal expansion of 26th root of 26.
 * @author Sean A. Irvine
 */
public class A011445 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(26);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
