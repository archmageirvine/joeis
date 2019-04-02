package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154514 a(n) = 648*n^2 - 72*n + 1.
 * @author Sean A. Irvine
 */
public class A154514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154514() {
    super(new long[] {1, -3, 3}, new long[] {577, 2449, 5617});
  }
}
