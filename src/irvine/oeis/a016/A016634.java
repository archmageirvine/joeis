package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016634 Decimal expansion of log(11).
 * @author Sean A. Irvine
 */
public class A016634 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
