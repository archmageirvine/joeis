package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010263 Continued fraction for cube root of 34.
 * @author Sean A. Irvine
 */
public class A010263 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010263() {
    super(0, new A010605());
  }
}
