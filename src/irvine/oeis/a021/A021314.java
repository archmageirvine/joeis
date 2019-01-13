package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021314.
 * @author Sean A. Irvine
 */
public class A021314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021314() {
    super(new long[] {-220, 372, -175, 24}, new long[] {1, 24, 401, 5796});
  }
}
