package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010274 Continued fraction for cube root of 45.
 * @author Sean A. Irvine
 */
public class A010274 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010274() {
    super(0, new A010616());
  }
}
