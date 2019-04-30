package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016686 Decimal expansion of <code>log(63)</code>.
 * @author Sean A. Irvine
 */
public class A016686 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(63).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
