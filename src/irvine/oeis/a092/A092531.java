package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092531.
 * @author Sean A. Irvine
 */
public class A092531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092531() {
    super(new long[] {-1, 1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1}, new long[] {1, 1, 1, 1, 3, 3, 3, 3, 7, 7, 8, 8, 14, 14, 16});
  }
}
