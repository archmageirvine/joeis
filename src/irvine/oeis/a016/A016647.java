package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016647 Decimal expansion of <code>log(24)</code>.
 * @author Sean A. Irvine
 */
public class A016647 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

