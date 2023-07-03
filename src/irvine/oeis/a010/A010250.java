package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010250 Continued fraction for cube root of 20.
 * @author Sean A. Irvine
 */
public class A010250 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010250() {
    super(0, new A010592());
  }
}
