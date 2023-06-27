package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127316 a(n) = 2*n^2 - 4*n + 73.
 * @author Sean A. Irvine
 */
public class A127316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127316() {
    super(1, new long[] {1, -3, 3}, new long[] {71, 73, 79});
  }
}
