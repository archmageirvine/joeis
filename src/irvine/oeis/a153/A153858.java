package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153858 Decimal expansion of <code>log_17 (8)</code>.
 * @author Sean A. Irvine
 */
public class A153858 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
