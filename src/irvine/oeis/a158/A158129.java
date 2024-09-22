package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158129 a(n) = 100*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158129() {
    super(0, new long[] {1, -3, 3}, new long[] {0, 98, 396});
  }
}
