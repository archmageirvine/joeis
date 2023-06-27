package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027933 a(n) = T(n, 2*n-10), T given by A027926.
 * @author Sean A. Irvine
 */
public class A027933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027933() {
    super(5, new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 2, 5, 13, 34, 89, 232, 596, 1490, 3588, 8273});
  }
}
