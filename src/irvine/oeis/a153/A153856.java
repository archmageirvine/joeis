package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153856 Decimal expansion of <code>log_14 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153856 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
