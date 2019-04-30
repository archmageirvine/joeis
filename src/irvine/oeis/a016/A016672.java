package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016672 Decimal expansion of <code>log(49)</code>.
 * @author Sean A. Irvine
 */
public class A016672 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(49).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
