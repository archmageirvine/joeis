package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A072334 Decimal expansion of e^2.
 * @author Sean A. Irvine
 */
public class A072334 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
