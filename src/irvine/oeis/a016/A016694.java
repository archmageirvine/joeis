package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016694 Decimal expansion of log(71).
 * @author Sean A. Irvine
 */
public class A016694 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(71).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
