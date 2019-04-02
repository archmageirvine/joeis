package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188135 a(n) = 8*n^2 + 2*n + 1.
 * @author Sean A. Irvine
 */
public class A188135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188135() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 37});
  }
}
