package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016712 Decimal expansion of <code>log(89)</code>.
 * @author Sean A. Irvine
 */
public class A016712 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(89).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
