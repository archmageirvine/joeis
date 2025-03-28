package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158128 a(n) = 100*n + 1.
 * @author Sean A. Irvine
 */
public class A158128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158128() {
    super(1, new long[] {-1, 2}, new long[] {101, 201});
  }
}
