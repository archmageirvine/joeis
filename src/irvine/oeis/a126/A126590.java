package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126590 Multiples of 3 or 5 but not both.
 * @author Sean A. Irvine
 */
public class A126590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126590() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {3, 5, 6, 9, 10, 12, 18});
  }
}
