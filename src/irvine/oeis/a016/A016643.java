package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016643 Decimal expansion of log(20).
 * @author Sean A. Irvine
 */
public class A016643 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

