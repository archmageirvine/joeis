package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037594.
 * @author Sean A. Irvine
 */
public class A037594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037594() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 8, 67, 537});
  }
}
