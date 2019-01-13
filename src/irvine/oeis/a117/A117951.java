package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117951.
 * @author Sean A. Irvine
 */
public class A117951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117951() {
    super(new long[] {1, -3, 3}, new long[] {5, 6, 9});
  }
}
