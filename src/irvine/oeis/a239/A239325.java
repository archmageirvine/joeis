package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239325 a(n) = 6*n^2 + 8*n + 1.
 * @author Sean A. Irvine
 */
public class A239325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239325() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 41});
  }
}
