package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011488 Decimal expansion of 69th root of 69.
 * @author Sean A. Irvine
 */
public class A011488 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(69);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
