package irvine.oeis.a235;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A235367 Sum of positive even numbers up to n^2.
 * @author Sean A. Irvine
 */
public class A235367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235367() {
    super(1, new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 6, 20, 72, 156, 342, 600, 1056});
  }
}
