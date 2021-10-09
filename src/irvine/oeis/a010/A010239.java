package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010239 Continued fraction for cube root of 9.
 * @author Sean A. Irvine
 */
public class A010239 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010239() {
    super(new A010581());
  }
}
