package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011496 Decimal expansion of 77th root of 77.
 * @author Sean A. Irvine
 */
public class A011496 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(77);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
