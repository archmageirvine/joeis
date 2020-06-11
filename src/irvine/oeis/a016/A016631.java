package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016631 Decimal expansion of <code>log(8)</code>.
 * @author Sean A. Irvine
 */
public class A016631 extends DecimalExpansionSequence {

  private static final CR N = CR.EIGHT.log();

  @Override
  protected CR getCR() {
    return N;
  }
}
