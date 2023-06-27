package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034326 Hours struck by a clock.
 * @author Sean A. Irvine
 */
public class A034326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034326() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
  }
}
