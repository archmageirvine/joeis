package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117451.
 * @author Sean A. Irvine
 */
public class A117451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117451() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 0, 1, 1, 1, 3});
  }
}
