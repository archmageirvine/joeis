package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030452 Markov numbers satisfying region 5 (x=5) of the equation x^2 + y^2 + z^2 = 3xyz.
 * @author Sean A. Irvine
 */
public class A030452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030452() {
    super(1, new long[] {-1, 0, 15, 0}, new long[] {1, 2, 13, 29});
  }
}
