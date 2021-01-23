package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019675 Decimal expansion of Pi/8.
 * @author Sean A. Irvine
 */
public class A019675 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.EIGHT);

  @Override
  protected CR getCR() {
    return N;
  }
}
