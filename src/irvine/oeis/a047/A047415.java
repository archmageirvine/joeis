package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047415.
 * @author Sean A. Irvine
 */
public class A047415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047415() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 3, 4, 6});
  }
}
