package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011450 Decimal expansion of 31st root of 31.
 * @author Sean A. Irvine
 */
public class A011450 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(31);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
