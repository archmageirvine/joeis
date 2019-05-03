package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033305 Number of permutations <code>(p1,...,pn)</code> such that <code>1&lt;=|pk-k|&lt;=2</code> for all k.
 * @author Sean A. Irvine
 */
public class A033305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033305() {
    super(new long[] {-1, 1, 1, 1, 1}, new long[] {1, 0, 1, 2, 4});
  }
}
