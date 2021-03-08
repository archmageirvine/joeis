package irvine.oeis.a042;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A042976 Decimal expansion of .121121112...^2, cf. A042974.
 * @author Sean A. Irvine
 */
public class A042976 extends DecimalExpansionSequence {

  private static final CR N = A042975.M.multiply(A042975.M);

  @Override
  protected CR getCR() {
    return N;
  }
}
