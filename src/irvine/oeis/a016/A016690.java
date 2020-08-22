package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016690 Decimal expansion of log(67).
 * @author Sean A. Irvine
 */
public class A016690 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(67).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
