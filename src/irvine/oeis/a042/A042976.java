package irvine.oeis.a042;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A042976 Decimal expansion of .121121112...^2, cf. A042974.
 * @author Sean A. Irvine
 */
public class A042976 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A042976() {
    super(A042975.M.multiply(A042975.M));
  }
}
