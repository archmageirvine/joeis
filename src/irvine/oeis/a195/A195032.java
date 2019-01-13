package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195032.
 * @author Sean A. Irvine
 */
public class A195032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195032() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 5, 17, 27, 51});
  }
}
