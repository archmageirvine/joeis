package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158591 a(n) = 36*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158591() {
    super(new long[] {1, -3, 3}, new long[] {1, 37, 145});
  }
}
