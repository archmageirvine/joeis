package irvine.oeis.a363;

import irvine.oeis.a010.A010060;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A363360 Decimal expansion of real number [0,1,1,0,...] formed by taking the Thue-Morse sequence (A010060) as partial quotients of a continued fraction.
 * @author Sean A. Irvine
 */
public class A363360 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A363360() {
    super(0, new A010060());
  }
}
