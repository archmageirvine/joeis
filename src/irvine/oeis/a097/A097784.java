package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097784.
 * @author Sean A. Irvine
 */
public class A097784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097784() {
    super(new long[] {1, -11, 11}, new long[] {1, 11, 110});
  }
}
