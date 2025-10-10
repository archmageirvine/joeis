package irvine.oeis.a388;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A388655 Continued fraction expansion of 6*Sum_{k&gt;=0} 12^(-2^k).
 * @author Sean A. Irvine
 */
public class A388655 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A388655() {
    super(0, new A388852());
  }
}
