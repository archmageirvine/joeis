package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109045 <code>a(n) = lcm(n,4)</code>.
 * @author Sean A. Irvine
 */
public class A109045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109045() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 4, 4, 12, 4, 20, 12, 28});
  }
}
