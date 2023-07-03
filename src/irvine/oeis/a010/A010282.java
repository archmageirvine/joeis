package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010282 Continued fraction for cube root of 53.
 * @author Sean A. Irvine
 */
public class A010282 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010282() {
    super(0, new A010624());
  }
}
