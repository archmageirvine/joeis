package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186111 <code>a(n) = -n</code> if n odd, <code>a(2n) = 3n</code> if n odd, <code>a(4n) = 2n</code>.
 * @author Sean A. Irvine
 */
public class A186111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186111() {
    super(new long[] {-1, -2, -3, -4, -3, -2}, new long[] {1, -3, 3, -2, 5, -9});
  }
}
