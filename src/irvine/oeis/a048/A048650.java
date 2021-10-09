package irvine.oeis.a048;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A048650 Continued fraction for Sum_{m&gt;=0} 1/(2^2^m - 1).
 * @author Sean A. Irvine
 */
public class A048650 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A048650() {
    super(new A048649());
  }
}
