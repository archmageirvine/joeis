package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010320 Continued fraction for cube root of 92.
 * @author Sean A. Irvine
 */
public class A010320 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010320() {
    super(0, new A010662());
  }
}
