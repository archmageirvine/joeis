package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154157 Decimal expansion of <code>log_6 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154157 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
