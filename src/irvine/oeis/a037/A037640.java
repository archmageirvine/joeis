package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037640.
 * @author Sean A. Irvine
 */
public class A037640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037640() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 13, 66, 332});
  }
}
