package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016697 Decimal expansion of log(74).
 * @author Sean A. Irvine
 */
public class A016697 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(74).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
