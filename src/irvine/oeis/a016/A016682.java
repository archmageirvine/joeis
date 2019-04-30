package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016682 Decimal expansion of <code>log(59)</code>.
 * @author Sean A. Irvine
 */
public class A016682 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(59).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
