package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268306 The number of even permutations p of 1,2,...,n such that -1&lt;=p(i)-i&lt;=2 for i=1,2,...,n.
 * @author Sean A. Irvine
 */
public class A268306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268306() {
    super(1, new long[] {-1, 0, -1, 2, -1, 2}, new long[] {1, 1, 2, 4, 7, 12});
  }
}
