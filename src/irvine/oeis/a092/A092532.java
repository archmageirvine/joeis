package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092532.
 * @author Sean A. Irvine
 */
public class A092532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092532() {
    super(new long[] {1, -1, 0, 0, -1, 1, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 6});
  }
}
