package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016707 Decimal expansion of log(84).
 * @author Sean A. Irvine
 */
public class A016707 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(84).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
