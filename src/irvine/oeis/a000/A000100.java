package irvine.oeis.a000;

import irvine.oeis.LinearRecurrence;

/**
 * A000100.
 * @author Sean A. Irvine
 */
public class A000100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000100() {
    super(new long[] {-1, -2, -1, 1, 2}, new long[] {0, 0, 0, 1, 2});
  }
}

