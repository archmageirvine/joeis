package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168410 <code>a(n) = 3 + 9*floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A168410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168410() {
    super(new long[] {-1, 1, 1}, new long[] {3, 12, 12});
  }
}
