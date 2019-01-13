package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247112.
 * @author Sean A. Irvine
 */
public class A247112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247112() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 67, 267, 746});
  }
}
