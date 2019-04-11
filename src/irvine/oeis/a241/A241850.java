package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241850 <code>a(n) = n^2 + 20</code>.
 * @author Sean A. Irvine
 */
public class A241850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241850() {
    super(new long[] {1, -3, 3}, new long[] {20, 21, 24});
  }
}
