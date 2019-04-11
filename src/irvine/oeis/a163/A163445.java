package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163445 <code>a(n) = 14*a(n-1) - 47*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 9</code>.
 * @author Sean A. Irvine
 */
public class A163445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163445() {
    super(new long[] {-47, 14}, new long[] {1, 9});
  }
}
