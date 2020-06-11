package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155522 Decimal expansion of <code>log_10 (20)</code>.
 * @author Sean A. Irvine
 */
public class A155522 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
