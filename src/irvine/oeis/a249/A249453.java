package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249453 <code>a(0) = 4;</code> for <code>n&gt;0, a(n) = a(n-1) + 2^n - 3</code>.
 * @author Sean A. Irvine
 */
public class A249453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249453() {
    super(new long[] {2, -5, 4}, new long[] {4, 3, 4});
  }
}
