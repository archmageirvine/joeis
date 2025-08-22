package irvine.oeis.a079;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A079587 Continued fraction expansion of Sum_{k&gt;=1} 1/F(k) where F(k) is the k-th Fibonacci number A000045(k).
 * @author Sean A. Irvine
 */
public class A079587 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A079587() {
    super(0, new A079586());
  }
}
