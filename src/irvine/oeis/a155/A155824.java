package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155824 Decimal expansion of <code>log_7(23)</code>.
 * @author Sean A. Irvine
 */
public class A155824 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
