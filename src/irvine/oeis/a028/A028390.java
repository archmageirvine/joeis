package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028390 Nearest integer to 3n/4 unless that is an integer, when 3n/2.
 * @author Sean A. Irvine
 */
public class A028390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028390() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 2, 6, 4, 5, 5});
  }
}
