package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016699 Decimal expansion of <code>log(76)</code>.
 * @author Sean A. Irvine
 */
public class A016699 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(76).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
