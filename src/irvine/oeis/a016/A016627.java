package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016627 Decimal expansion of <code>log(4)</code>.
 * @author Sean A. Irvine
 */
public class A016627 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.log();

  @Override
  protected CR getCR() {
    return N;
  }
}
