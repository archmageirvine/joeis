package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011446 Decimal expansion of 27th root of 27.
 * @author Sean A. Irvine
 */
public class A011446 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(27);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
