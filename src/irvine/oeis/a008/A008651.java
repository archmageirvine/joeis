package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008651.
 * @author Sean A. Irvine
 */
public class A008651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008651() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 0, -1}, new long[] {1, 0, 0, 0, 0, 0, 1, 0, 0});
  }
}

