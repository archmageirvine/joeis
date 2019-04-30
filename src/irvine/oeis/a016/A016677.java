package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016677 Decimal expansion of <code>log(54)</code>.
 * @author Sean A. Irvine
 */
public class A016677 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(54).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
