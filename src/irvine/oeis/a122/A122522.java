package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122522 a(n) = a(n - 2) + a(n - 8), with a(1) = ... = a(8) = 1.
 * @author Sean A. Irvine
 */
public class A122522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122522() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 1, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}
