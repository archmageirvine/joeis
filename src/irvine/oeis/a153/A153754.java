package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153754 Decimal expansion of <code>log_6 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153754 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
