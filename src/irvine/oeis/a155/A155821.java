package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155821 Decimal expansion of log_5 <code>(23)</code>.
 * @author Sean A. Irvine
 */
public class A155821 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
