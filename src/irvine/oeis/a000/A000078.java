package irvine.oeis.a000;

import irvine.oeis.LinearRecurrence;

/**
 * A000078.
 * @author Sean A. Irvine
 */
public class A000078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000078() {
    super(new long[] {1, 1, 1, 1}, new long[] {0, 0, 0, 1});
  }
}
