package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249020 a(n) = floor( n * (n+5) / 10) + 1.
 * @author Sean A. Irvine
 */
public class A249020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249020() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 1, 2, 3, 4, 6, 7});
  }
}
