package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011466 Decimal expansion of <code>47th</code> root of 47.
 * @author Sean A. Irvine
 */
public class A011466 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(47);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
