package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163446 <code>a(n) = 16*a(n-1) - 62*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A163446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163446() {
    super(new long[] {-62, 16}, new long[] {1, 10});
  }
}
