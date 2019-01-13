package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037501.
 * @author Sean A. Irvine
 */
public class A037501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037501() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 8, 66, 529});
  }
}
