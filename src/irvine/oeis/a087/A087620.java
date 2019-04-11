package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087620 #{0&lt;=k&lt;=n: <code>k*n</code> is divisible by <code>4}</code>.
 * @author Sean A. Irvine
 */
public class A087620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087620() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 2, 1, 5, 2, 4, 2});
  }
}
