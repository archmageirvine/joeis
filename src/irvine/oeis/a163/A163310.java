package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163310 <code>a(n) = 20*a(n-1) - 95*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 11</code>.
 * @author Sean A. Irvine
 */
public class A163310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163310() {
    super(new long[] {-95, 20}, new long[] {1, 11});
  }
}
