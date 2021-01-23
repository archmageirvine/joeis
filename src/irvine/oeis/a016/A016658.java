package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016658 Decimal expansion of log(35).
 * @author Sean A. Irvine
 */
public class A016658 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(35).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
