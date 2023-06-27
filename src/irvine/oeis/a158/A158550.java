package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158550 a(n) = 169*n^2 - 13.
 * @author Sean A. Irvine
 */
public class A158550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158550() {
    super(1, new long[] {1, -3, 3}, new long[] {156, 663, 1508});
  }
}
