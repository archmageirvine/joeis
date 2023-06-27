package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057780 Multiples of 3 that are one less than a perfect square.
 * @author Sean A. Irvine
 */
public class A057780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057780() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 15, 24, 48});
  }
}
