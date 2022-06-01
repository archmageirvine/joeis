package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116561 Sequentially switched Markov of six determinant one matrices.
 * @author Sean A. Irvine
 */
public class A116561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116561() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 4, 18, 7, 7, 18, 79, 79, 359, 140});
  }
}
