package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180576.
 * @author Sean A. Irvine
 */
public class A180576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180576() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {4, 27, 69, 148, 255, 417});
  }
}
