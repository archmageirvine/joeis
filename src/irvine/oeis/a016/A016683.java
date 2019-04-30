package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016683 Decimal expansion of <code>log(60)</code>.
 * @author Sean A. Irvine
 */
public class A016683 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(60).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
