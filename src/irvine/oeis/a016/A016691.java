package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016691 Decimal expansion of log(68).
 * @author Sean A. Irvine
 */
public class A016691 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(68).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
