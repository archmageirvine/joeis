package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161532 a(n) = 2*n^2 + 8*n + 1.
 * @author Sean A. Irvine
 */
public class A161532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161532() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 25});
  }
}
