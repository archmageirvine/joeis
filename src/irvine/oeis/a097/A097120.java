package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097120.
 * @author Sean A. Irvine
 */
public class A097120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097120() {
    super(new long[] {3, 1, -3, 3}, new long[] {1, 1, 1, 1});
  }
}
