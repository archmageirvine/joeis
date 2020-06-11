package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153627 Decimal expansion of <code>log_17 (7)</code>.
 * @author Sean A. Irvine
 */
public class A153627 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
