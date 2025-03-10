package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126665 a(n) = -n^2 + 9*n + 53.
 * @author Sean A. Irvine
 */
public class A126665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126665() {
    super(new long[] {1, -3, 3}, new long[] {53, 61, 67});
  }
}
