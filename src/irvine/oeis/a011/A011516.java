package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011516 Decimal expansion of 97th root of 97.
 * @author Sean A. Irvine
 */
public class A011516 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(97);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
