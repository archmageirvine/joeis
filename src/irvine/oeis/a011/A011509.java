package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011509 Decimal expansion of 90th root of 90.
 * @author Sean A. Irvine
 */
public class A011509 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(90);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
