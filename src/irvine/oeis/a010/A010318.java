package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010318 Continued fraction for cube root of 90.
 * @author Sean A. Irvine
 */
public class A010318 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010318() {
    super(new A010660());
  }
}
