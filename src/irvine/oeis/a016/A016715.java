package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016715 Decimal expansion of log(92).
 * @author Sean A. Irvine
 */
public class A016715 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(92).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
