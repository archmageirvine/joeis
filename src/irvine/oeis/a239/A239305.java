package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239305.
 * @author Sean A. Irvine
 */
public class A239305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239305() {
    super(new long[] {2, 3, -4, -3, 4}, new long[] {1, 1, 2, 6, 13});
  }
}
