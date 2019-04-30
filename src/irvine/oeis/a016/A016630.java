package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016630 Decimal expansion of <code>log(7)</code>.
 * @author Sean A. Irvine
 */
public class A016630 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(7).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
