package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163349 <code>a(n) = 10*a(n-1) - 23*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 9</code>.
 * @author Sean A. Irvine
 */
public class A163349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163349() {
    super(new long[] {-23, 10}, new long[] {1, 9});
  }
}
