package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212892 a(n) = n^4/8 if n is even, a(n) = (n^2-1)^2/8 if n is odd.
 * @author Sean A. Irvine
 */
public class A212892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212892() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 2, 8, 32, 72, 162, 288});
  }
}
