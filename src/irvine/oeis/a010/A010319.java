package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010319 Continued fraction for cube root of 91.
 * @author Sean A. Irvine
 */
public class A010319 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010319() {
    super(new A010661());
  }
}
