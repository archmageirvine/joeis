package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019680 Decimal expansion of Pi/13.
 * @author Sean A. Irvine
 */
public class A019680 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(13));

  @Override
  protected CR getCR() {
    return N;
  }
}
