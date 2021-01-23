package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016675 Decimal expansion of log(52).
 * @author Sean A. Irvine
 */
public class A016675 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(52).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
