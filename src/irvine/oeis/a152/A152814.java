package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152814 Decimal expansion of log_19 <code>(2)</code>.
 * @author Sean A. Irvine
 */
public class A152814 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
