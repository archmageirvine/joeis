package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114568 A vector matrix Markov sequence whose ration approximates the fine structure constant alpha using a single prime 4691 cubic characteristic polynomial.
 * @author Sean A. Irvine
 */
public class A114568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114568() {
    super(new long[] {9380, 4694, 0}, new long[] {0, 1, 1});
  }
}
