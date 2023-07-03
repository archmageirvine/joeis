package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010242 Continued fraction for cube root of 12.
 * @author Sean A. Irvine
 */
public class A010242 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010242() {
    super(0, new A010584());
  }
}
