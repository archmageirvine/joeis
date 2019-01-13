package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092498.
 * @author Sean A. Irvine
 */
public class A092498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092498() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 4, 11, 23, 41, 67});
  }
}
