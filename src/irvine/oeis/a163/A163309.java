package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163309 <code>a(n) = 18*a(n-1) - 76*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A163309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163309() {
    super(new long[] {-76, 18}, new long[] {1, 10});
  }
}
