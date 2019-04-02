package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011452 Decimal expansion of 33rd root of 33.
 * @author Sean A. Irvine
 */
public class A011452 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(33);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
