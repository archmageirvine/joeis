package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037576.
 * @author Sean A. Irvine
 */
public class A037576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037576() {
    super(new long[] {-4, 1, 4}, new long[] {1, 7, 29});
  }
}
