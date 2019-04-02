package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016651 Decimal expansion of log(28).
 * @author Sean A. Irvine
 */
public class A016651 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(28).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

