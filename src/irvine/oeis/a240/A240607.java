package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240607 <code>a(n) = 2*a(n-2)+a(n-3)+a(n-4)</code> for <code>n&gt;=4, a(n) = binomial(n,3)</code> for <code>n&lt;4</code>.
 * @author Sean A. Irvine
 */
public class A240607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240607() {
    super(new long[] {1, 1, 2, 0}, new long[] {0, 0, 0, 1});
  }
}
