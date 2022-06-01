package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163446 a(n) = 16*a(n-1) - 62*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 10.
 * @author Sean A. Irvine
 */
public class A163446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163446() {
    super(new long[] {-62, 16}, new long[] {1, 10});
  }
}
