package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010323 Continued fraction for cube root of 95.
 * @author Sean A. Irvine
 */
public class A010323 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010323() {
    super(new A010665());
  }
}
