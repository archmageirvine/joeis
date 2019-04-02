package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010325 Continued fraction for cube root of 97.
 * @author Sean A. Irvine
 */
public class A010325 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010325() {
    super(new A010667());
  }
}
