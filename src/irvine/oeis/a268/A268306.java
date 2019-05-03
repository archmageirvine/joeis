package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268306 The number of even permutations p of <code>1,2,...,n</code> such that <code>-1&lt;=p(i)-i&lt;=2</code> for <code>i=1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A268306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268306() {
    super(new long[] {-1, 0, -1, 2, -1, 2}, new long[] {1, 1, 2, 4, 7, 12});
  }
}
