package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037531.
 * @author Sean A. Irvine
 */
public class A037531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037531() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 7, 44, 265});
  }
}
