package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008998.
 * @author Sean A. Irvine
 */
public class A008998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008998() {
    super(new long[] {1, 0, 2}, new long[] {1, 2, 4});
  }
}

