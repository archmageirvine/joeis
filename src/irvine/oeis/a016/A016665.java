package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016665 Decimal expansion of log(42).
 * @author Sean A. Irvine
 */
public class A016665 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(42).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
