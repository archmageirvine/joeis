package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216263.
 * @author Sean A. Irvine
 */
public class A216263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216263() {
    super(new long[] {2, -9, 6}, new long[] {1, 6, 27});
  }
}
