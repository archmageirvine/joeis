package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163192 <code>a(n) = 20*a(n-1)-93*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A163192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163192() {
    super(new long[] {-93, 20}, new long[] {1, 10});
  }
}
