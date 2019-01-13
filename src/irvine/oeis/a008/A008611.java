package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008611.
 * @author Sean A. Irvine
 */
public class A008611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008611() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 0, 1, 2});
  }
}

