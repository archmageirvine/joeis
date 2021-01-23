package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016687 Decimal expansion of log(64).
 * @author Sean A. Irvine
 */
public class A016687 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(64).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
