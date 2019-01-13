package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117794.
 * @author Sean A. Irvine
 */
public class A117794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117794() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 6, 66, 120, 276});
  }
}
