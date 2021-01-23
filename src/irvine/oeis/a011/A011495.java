package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011495 Decimal expansion of 76th root of 76.
 * @author Sean A. Irvine
 */
public class A011495 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(76);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
