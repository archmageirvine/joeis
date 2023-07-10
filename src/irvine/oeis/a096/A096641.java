package irvine.oeis.a096;

import irvine.oeis.a155.A155559;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A096641 Decimal expansion of number with continued fraction expansion 0, 2, 4, 8, 16, ... (0 and positive powers of 2).
 * @author Sean A. Irvine
 */
public class A096641 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A096641() {
    super(new A155559());
  }
}
