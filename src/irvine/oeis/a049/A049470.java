package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A049470 Decimal expansion of cos(1).
 * @author Sean A. Irvine
 */
public class A049470 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.cos();

  @Override
  protected CR getCR() {
    return N;
  }
}
