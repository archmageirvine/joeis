package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092493.
 * @author Sean A. Irvine
 */
public class A092493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092493() {
    super(new long[] {-1, 1, 3, -4, 4}, new long[] {1, 2, 5, 14, 42});
  }
}
