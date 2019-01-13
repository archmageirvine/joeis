package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097124.
 * @author Sean A. Irvine
 */
public class A097124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097124() {
    super(new long[] {6, -3, 3}, new long[] {1, 1, 1});
  }
}
