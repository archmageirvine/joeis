package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016716 Decimal expansion of <code>log(93)</code>.
 * @author Sean A. Irvine
 */
public class A016716 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(93).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
