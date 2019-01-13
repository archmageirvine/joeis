package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037723.
 * @author Sean A. Irvine
 */
public class A037723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037723() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {2, 8, 35, 141, 566});
  }
}
