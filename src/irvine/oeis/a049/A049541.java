package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A049541 Decimal expansion of 1/Pi.
 * @author Sean A. Irvine
 */
public class A049541 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
