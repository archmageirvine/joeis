package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137928.
 * @author Sean A. Irvine
 */
public class A137928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137928() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 4, 10, 16});
  }
}
