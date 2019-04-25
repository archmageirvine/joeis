package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251754 Digital root of A027444(n) <code>= n + n^2 + n^3, n&gt;=1.</code> Repeat(3, 5, 3, 3, 2, 6, 3, 8, 9).
 * @author Sean A. Irvine
 */
public class A251754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251754() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 5, 3, 3, 2, 6, 3, 8, 9});
  }
}
