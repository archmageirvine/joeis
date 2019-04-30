package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016635 Decimal expansion of <code>log(12)</code>.
 * @author Sean A. Irvine
 */
public class A016635 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
