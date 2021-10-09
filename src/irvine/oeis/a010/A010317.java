package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010317 Continued fraction for cube root of 89.
 * @author Sean A. Irvine
 */
public class A010317 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010317() {
    super(new A010659());
  }
}
