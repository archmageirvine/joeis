package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097564.
 * @author Sean A. Irvine
 */
public class A097564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097564() {
    super(new long[] {1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 2, 1, 3});
  }
}
