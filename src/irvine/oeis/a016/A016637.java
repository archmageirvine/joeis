package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016637 Decimal expansion of log(14).
 * @author Sean A. Irvine
 */
public class A016637 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

