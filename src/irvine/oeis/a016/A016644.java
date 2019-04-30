package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016644 Decimal expansion of <code>log(21)</code>.
 * @author Sean A. Irvine
 */
public class A016644 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

