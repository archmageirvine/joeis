package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021694.
 * @author Sean A. Irvine
 */
public class A021694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021694() {
    super(new long[] {-297, 456, -182, 24}, new long[] {1, 24, 394, 5544});
  }
}
