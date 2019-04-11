package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147604 A vector matrix Markov related to A097886 with characteristic polynomial: <code>1 - x^2 + x^3 + x^4 - x^5</code>.
 * @author Sean A. Irvine
 */
public class A147604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147604() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {1, 1, 3, 2, 4});
  }
}
