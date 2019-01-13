package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037516.
 * @author Sean A. Irvine
 */
public class A037516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037516() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 14, 99, 695});
  }
}
