package irvine.oeis.a240;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240607 a(n) = 2*a(n-2)+a(n-3)+a(n-4) for n&gt;=4, a(n) = binomial(n,3) for n&lt;4.
 * @author Sean A. Irvine
 */
public class A240607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240607() {
    super(new long[] {1, 1, 2, 0}, new long[] {0, 0, 0, 1});
  }
}
