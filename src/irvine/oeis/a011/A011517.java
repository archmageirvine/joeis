package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011517 Decimal expansion of 98th root of 98.
 * @author Sean A. Irvine
 */
public class A011517 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(98);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
