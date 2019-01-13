package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247907.
 * @author Sean A. Irvine
 */
public class A247907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247907() {
    super(new long[] {-1, 1, -1, 1, -1, 2, -2, 2}, new long[] {1, 2, 2, 2, 3, 5, 7, 9});
  }
}
