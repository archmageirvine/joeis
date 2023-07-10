package irvine.oeis.a191;

import irvine.oeis.a000.A000931;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A191896 Decimal expansion of the constant whose continued fraction is based on Padovan numbers A000931.
 * @author Sean A. Irvine
 */
public class A191896 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A191896() {
    super(0, new A000931().skip(4));
  }
}
