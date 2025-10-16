package irvine.oeis.a389;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A389522 Continued fraction expansion of 3*Sum_{k&gt;=0} 6^(-2^k).
 * @author Sean A. Irvine
 */
public class A389522 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A389522() {
    super(0, new A389527());
  }
}
