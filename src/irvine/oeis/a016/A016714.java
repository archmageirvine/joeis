package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016714 Decimal expansion of <code>log(91)</code>.
 * @author Sean A. Irvine
 */
public class A016714 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(91).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
