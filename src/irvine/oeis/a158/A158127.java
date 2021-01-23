package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158127 a(n) = 100*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158127() {
    super(new long[] {1, -3, 3}, new long[] {102, 404, 906});
  }
}
