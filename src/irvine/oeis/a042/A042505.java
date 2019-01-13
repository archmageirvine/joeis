package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042505.
 * @author Sean A. Irvine
 */
public class A042505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042505() {
    super(new long[] {-1, 0, 0, 0, 782, 0, 0, 0}, new long[] {1, 1, 13, 14, 769, 783, 10165, 10948});
  }
}
