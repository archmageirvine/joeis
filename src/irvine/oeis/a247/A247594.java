package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247594.
 * @author Sean A. Irvine
 */
public class A247594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247594() {
    super(new long[] {3, 1, 1}, new long[] {1, 2, 5});
  }
}
