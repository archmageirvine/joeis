package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011498 Decimal expansion of 79th root of 79.
 * @author Sean A. Irvine
 */
public class A011498 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(79);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
