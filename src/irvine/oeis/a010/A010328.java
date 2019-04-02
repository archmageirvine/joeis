package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010328 Continued fraction for cube root of 100.
 * @author Sean A. Irvine
 */
public class A010328 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010328() {
    super(new A010670());
  }
}
