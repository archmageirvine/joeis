package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028390.
 * @author Sean A. Irvine
 */
public class A028390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028390() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 2, 6, 4, 5, 5});
  }
}
