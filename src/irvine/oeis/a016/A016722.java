package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016722 Decimal expansion of log(99).
 * @author Sean A. Irvine
 */
public class A016722 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(99).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
