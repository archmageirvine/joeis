package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168337 <code>a(n) = 1 + 7*floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A168337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168337() {
    super(new long[] {-1, 1, 1}, new long[] {1, 8, 8});
  }
}
