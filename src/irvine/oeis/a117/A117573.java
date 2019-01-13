package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117573.
 * @author Sean A. Irvine
 */
public class A117573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117573() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 1, 4, 5, 8, 11});
  }
}
