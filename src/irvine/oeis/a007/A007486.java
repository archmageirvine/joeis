package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007486 <code>a(n) = a(n-1) + a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A007486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007486() {
    super(new long[] {1, 1, 1}, new long[] {1, 3, 4});
  }
}
