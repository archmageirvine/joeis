package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016667 Decimal expansion of <code>log(44)</code>.
 * @author Sean A. Irvine
 */
public class A016667 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(44).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
