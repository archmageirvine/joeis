package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037596.
 * @author Sean A. Irvine
 */
public class A037596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037596() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 10, 103, 1031});
  }
}
