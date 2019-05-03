package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011444 Decimal expansion of <code>25th</code> root of 25.
 * @author Sean A. Irvine
 */
public class A011444 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(25);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
