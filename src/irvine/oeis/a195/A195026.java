package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195026 <code>a(n) = 7*n*(2*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A195026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195026() {
    super(new long[] {1, -3, 3}, new long[] {0, 21, 70});
  }
}
