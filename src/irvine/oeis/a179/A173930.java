package irvine.oeis.a179;

import irvine.oeis.a000.A000001;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A173930 Decimal expansion of the number whose continued fraction expansion is A000001.
 * @author Sean A. Irvine
 */
public class A173930 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A173930() {
    super(1, new A000001());
  }
}
