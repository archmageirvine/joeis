package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016700 Decimal expansion of <code>log(77)</code>.
 * @author Sean A. Irvine
 */
public class A016700 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(77).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
