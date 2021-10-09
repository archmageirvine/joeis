package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010277 Continued fraction for cube root of 48.
 * @author Sean A. Irvine
 */
public class A010277 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010277() {
    super(new A010619());
  }
}
