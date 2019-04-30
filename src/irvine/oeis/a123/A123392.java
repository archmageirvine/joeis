package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123392 <code>a(-3) = a(-2) = a(-1) = 0, a(0) = 1, a(n) = a(n-1) + 2*a(n-2) + 2*a(n-3) + a(n-4)</code>, for <code>n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A123392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123392() {
    super(new long[] {1, 2, 2, 1}, new long[] {0, 0, 0, 1});
  }
}
