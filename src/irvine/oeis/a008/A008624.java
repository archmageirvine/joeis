package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008624.
 * @author Sean A. Irvine
 */
public class A008624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008624() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 0, 1, 1, 2});
  }
}

