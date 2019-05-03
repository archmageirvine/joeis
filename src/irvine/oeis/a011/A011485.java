package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011485 Decimal expansion of <code>66th</code> root of 66.
 * @author Sean A. Irvine
 */
public class A011485 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(66);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
