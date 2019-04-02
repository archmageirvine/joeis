package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A082020 Decimal expansion of 15/Pi^2.
 * @author Sean A. Irvine
 */
public class A082020 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).divide(CR.PI.multiply(CR.PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
