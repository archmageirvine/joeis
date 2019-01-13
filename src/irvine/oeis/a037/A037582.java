package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037582.
 * @author Sean A. Irvine
 */
public class A037582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037582() {
    super(new long[] {-10, 1, 10}, new long[] {1, 13, 131});
  }
}
