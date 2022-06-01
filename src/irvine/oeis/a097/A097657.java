package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097657 Fibonacci sequence with first two terms 11 and 23.
 * @author Sean A. Irvine
 */
public class A097657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097657() {
    super(new long[] {1, 1}, new long[] {11, 23});
  }
}
