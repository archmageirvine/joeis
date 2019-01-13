package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037747.
 * @author Sean A. Irvine
 */
public class A037747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037747() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {2, 17, 119, 834, 5840});
  }
}
