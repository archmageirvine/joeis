package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002392 Decimal expansion of natural logarithm of 10.
 * @author Sean A. Irvine
 */
public class A002392 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
