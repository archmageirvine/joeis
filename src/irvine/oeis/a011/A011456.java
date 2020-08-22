package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011456 Decimal expansion of 37th root of 37.
 * @author Sean A. Irvine
 */
public class A011456 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(37);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
