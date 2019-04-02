package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010281 Continued fraction for cube root of 52.
 * @author Sean A. Irvine
 */
public class A010281 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010281() {
    super(new A010623());
  }
}
