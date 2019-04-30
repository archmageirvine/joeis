package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016698 Decimal expansion of <code>log(75)</code>.
 * @author Sean A. Irvine
 */
public class A016698 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(75).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
