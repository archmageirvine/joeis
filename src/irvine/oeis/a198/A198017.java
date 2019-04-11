package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198017 <code>a(n) = n*(7*n + 11)/2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A198017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198017() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 26});
  }
}
