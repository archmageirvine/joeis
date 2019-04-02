package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010280 Continued fraction for cube root of 51.
 * @author Sean A. Irvine
 */
public class A010280 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010280() {
    super(new A010622());
  }
}
