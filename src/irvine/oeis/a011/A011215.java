package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011215 Decimal expansion of 6th root of 6.
 * @author Sean A. Irvine
 */
public class A011215 extends DecimalExpansionSequence {

  private static final CR SIX = CR.valueOf(6);
  private static final CR N = ComputableReals.SINGLETON.pow(SIX, SIX.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
