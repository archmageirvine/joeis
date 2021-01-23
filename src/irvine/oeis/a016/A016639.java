package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016639 Decimal expansion of log(16).
 * @author Sean A. Irvine
 */
public class A016639 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(16).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

