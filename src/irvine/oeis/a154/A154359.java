package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154359 a(n) = 1250*n^2 - 700*n + 99.
 * @author Sean A. Irvine
 */
public class A154359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154359() {
    super(new long[] {1, -3, 3}, new long[] {99, 649, 3699});
  }
}
