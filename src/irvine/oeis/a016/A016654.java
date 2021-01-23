package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016654 Decimal expansion of log(31).
 * @author Sean A. Irvine
 */
public class A016654 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(31).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

