package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016656 Decimal expansion of <code>log(33)</code>.
 * @author Sean A. Irvine
 */
public class A016656 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(33).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
